package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2File;
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
@Table(name = "world_safe_loc")
@Db2File(name = "WorldSafeLocs.db2", layoutHash = 0x605EA8A6, parentIndexField = 3)
public class WorldSafeLoc implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "AreaName")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString areaName;


    @Column(name = "LocX")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float locX;


    @Column(name = "LocY")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float locY;


    @Column(name = "LocZ")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float locZ;


    @Column(name = "Facing")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float facing;


    @Column(name = "MapID")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short mapID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
