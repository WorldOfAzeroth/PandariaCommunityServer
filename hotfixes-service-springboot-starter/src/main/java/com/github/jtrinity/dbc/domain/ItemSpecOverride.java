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
@Table(name = "item_spec_override")
@Db2DataBind(name = "ItemSpecOverride.db2", layoutHash = 0xE499CD2A, parentIndexField = 1, fields = {
        @Db2Field(name = "specID", type = Db2Type.SHORT),
        @Db2Field(name = "itemID", type = Db2Type.INT, signed = true)
})
public class ItemSpecOverride implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "SpecID")
    private Short specID;

    @Column(name = "ItemID")
    private Integer itemID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
