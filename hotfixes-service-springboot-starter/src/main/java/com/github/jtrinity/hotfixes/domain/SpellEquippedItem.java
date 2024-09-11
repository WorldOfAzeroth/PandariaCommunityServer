package com.github.jtrinity.hotfixes.domain;

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
@Table(name = "spell_equipped_items")
public class SpellEquippedItem {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "EquippedItemClass", nullable = false)
    private Byte equippedItemClass;

    @ColumnDefault("0")
    @Column(name = "EquippedItemInvTypes", nullable = false)
    private Integer equippedItemInvTypes;

    @ColumnDefault("0")
    @Column(name = "EquippedItemSubclass", nullable = false)
    private Integer equippedItemSubclass;

}