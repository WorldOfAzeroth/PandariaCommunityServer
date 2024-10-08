package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
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
@Table(name = "taxi_path")
@Db2DataBind(name = "TaxiPath.db2", layoutHash = 0xF44E2BF5, indexField = 2, parentIndexField = 0, fields = {
        @Db2Field(name = "fromTaxiNode", type = Db2Type.SHORT),
        @Db2Field(name = "toTaxiNode", type = Db2Type.SHORT),
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "cost", type = Db2Type.INT)
})
public class TaxiPath implements DbcEntity {
    @Column(name = "FromTaxiNode")
    private Short fromTaxiNode;

    @Column(name = "ToTaxiNode")
    private Short toTaxiNode;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Cost")
    private Integer cost;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
