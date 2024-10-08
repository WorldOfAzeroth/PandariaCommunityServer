package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.common.LocalizedString;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2DataBind;
import com.github.jtrinity.dbc.db2.Db2Type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString
@IdClass(DB2Id.class)
@Entity
@Table(name = "item_random_properties")
@Db2DataBind(name = "ItemRandomProperties.db2", layoutHash = 0xB67375F8, fields = {
        @Db2Field(name = "name", type = Db2Type.STRING),
        @Db2Field(name = {"enchantment1", "enchantment2", "enchantment3", "enchantment4", "enchantment5"}, type = Db2Type.SHORT)
})
public class ItemRandomProperty implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Name")
    private LocalizedString name;

    @Column(name = "Enchantment1")
    private Short enchantment1;

    @Column(name = "Enchantment2")
    private Short enchantment2;

    @Column(name = "Enchantment3")
    private Short enchantment3;

    @Column(name = "Enchantment4")
    private Short enchantment4;

    @Column(name = "Enchantment5")
    private Short enchantment5;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
