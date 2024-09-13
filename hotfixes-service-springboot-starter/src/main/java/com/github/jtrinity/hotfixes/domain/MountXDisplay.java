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
@Table(name = "mount_x_display")
@Db2File(name = "MountXDisplay.db2", fileDataId = 1576117, layoutHash = 0xC9D09486, parentIndexField = 2)
public class MountXDisplay {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "CreatureDisplayInfoID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer creatureDisplayInfoID;

    @ColumnDefault("'0'")
    @Column(name = "PlayerConditionID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Long playerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "MountID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long mountID;

}