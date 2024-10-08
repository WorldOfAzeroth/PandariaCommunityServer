package com.github.jtrinity.auth.boot;

import com.github.jtrinity.auth.domain.BattlenetAccount;
import com.github.jtrinity.auth.repository.BattlenetAccountRepository;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Objects;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackageClasses = BattlenetAccountRepository.class,
        entityManagerFactoryRef = "authEntityManagerFactory",
        transactionManagerRef = "authTransactionManager"
)
public class AuthAutoConfiguration {


    @Bean
    @ConfigurationProperties(prefix = "bnetserver.logindatabaseinfo")
    DataSource authDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean
    @ConfigurationProperties(prefix = "bnetserver.logindatabaseinfo.jpa")
    Properties authJpaProperties() {
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.hbm2ddl.auto", "none");
        jpaProperties.put("hibernate.show_sql", "true");
        jpaProperties.put("hibernate.order_inserts", "true");
        jpaProperties.put("hibernate.order_updates", "true");
        jpaProperties.put("hibernate.batch_versioned_data", "true");
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        return jpaProperties;
    }


    @Bean
    LocalContainerEntityManagerFactoryBean authEntityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(authDataSource());
        em.setPackagesToScan(BattlenetAccount.class.getPackageName());
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setMappingResources("META-INF/jpa-named-queries.xml");
        em.setPersistenceUnitName("auth");
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(authJpaProperties());
        return em;
    }


    @Bean
    PlatformTransactionManager authTransactionManager() {
        return new JpaTransactionManager(Objects.requireNonNull(authEntityManagerFactory().getObject()));
    }

}
