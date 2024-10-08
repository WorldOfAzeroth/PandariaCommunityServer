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
@Table(name = "artifact_power")
@Db2DataBind(name = "ArtifactPower.db2", layoutHash = 0x45240818, indexField = 5, parentIndexField = 1, fields = {
        @Db2Field(name = {"posX", "posY"}, type = Db2Type.FLOAT),
        @Db2Field(name = "artifactID", type = Db2Type.BYTE),
        @Db2Field(name = "flags", type = Db2Type.BYTE),
        @Db2Field(name = "maxPurchasableRank", type = Db2Type.BYTE),
        @Db2Field(name = "tier", type = Db2Type.BYTE),
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "label", type = Db2Type.INT, signed = true)
})
public class ArtifactPower implements DbcEntity {
    @Column(name = "PosX")
    private Float posX;

    @Column(name = "PosY")
    private Float posY;

    @Column(name = "ArtifactID")
    private Short artifactID;

    @Column(name = "Flags")
    private Byte flags;

    @Column(name = "MaxPurchasableRank")
    private Byte maxPurchasableRank;

    @Column(name = "Tier")
    private Byte tier;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Label")
    private Integer label;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
