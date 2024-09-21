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
@Table(name = "spell_levels")
@Db2File(name = "SpellLevels.db2", layoutHash = 0x9E7D1CCD, parentIndexField = 5)
public class SpellLevel implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "BaseLevel")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT, signed = true)
    private Short baseLevel;


    @Column(name = "MaxLevel")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short maxLevel;


    @Column(name = "SpellLevel")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT, signed = true)
    private Short spellLevel;


    @Column(name = "DifficultyID")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte difficultyID;


    @Column(name = "MaxPassiveAuraLevel")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte maxPassiveAuraLevel;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
