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
@Table(name = "spell_shapeshift")
@Db2File(name = "SpellShapeshift.db2", fileDataId = 1139929, layoutHash = 0xCBF64431)
public class SpellShapeshift {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "StanceBarOrder", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE, signed = true)
    private Byte stanceBarOrder;

    @ColumnDefault("0")
    @Column(name = "ShapeshiftExclude1", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer shapeshiftExclude1;

    @ColumnDefault("0")
    @Column(name = "ShapeshiftExclude2", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer shapeshiftExclude2;

    @ColumnDefault("0")
    @Column(name = "ShapeshiftMask1", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer shapeshiftMask1;

    @ColumnDefault("0")
    @Column(name = "ShapeshiftMask2", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer shapeshiftMask2;

}