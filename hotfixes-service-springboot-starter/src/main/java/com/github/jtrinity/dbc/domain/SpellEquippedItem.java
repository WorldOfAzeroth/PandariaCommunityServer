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
@Table(name = "spell_equipped_items")
@Db2DataBind(name = "SpellEquippedItems.db2", layoutHash = 0xCE628176, fields = {
        @Db2Field(name = "spellID", type = Db2Type.INT, signed = true),
        @Db2Field(name = "equippedItemInvTypes", type = Db2Type.INT, signed = true),
        @Db2Field(name = "equippedItemSubclass", type = Db2Type.INT, signed = true),
        @Db2Field(name = "equippedItemClass", type = Db2Type.BYTE, signed = true)
})
public class SpellEquippedItem implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "SpellID")
    private Integer spellID;

    @Column(name = "EquippedItemInvTypes")
    private Integer equippedItemInvTypes;

    @Column(name = "EquippedItemSubclass")
    private Integer equippedItemSubclass;

    @Column(name = "EquippedItemClass")
    private Byte equippedItemClass;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
