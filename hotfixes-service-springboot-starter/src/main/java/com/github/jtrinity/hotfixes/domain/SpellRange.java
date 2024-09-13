package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "spell_range")
@Db2File(name = "SpellRange.db2", fileDataId = 1146820, layoutHash = 0x1A9D89B3)
public class SpellRange {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "DisplayName")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String displayName;

    @Lob
    @Column(name = "DisplayNameShort")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String displayNameShort;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short flags;

    @ColumnDefault("0")
    @Column(name = "RangeMin1", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float rangeMin1;

    @ColumnDefault("0")
    @Column(name = "RangeMin2", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float rangeMin2;

    @ColumnDefault("0")
    @Column(name = "RangeMax1", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float rangeMax1;

    @ColumnDefault("0")
    @Column(name = "RangeMax2", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float rangeMax2;

}