package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.common.LocalizedString;
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
@Table(name = "quest_sort")
@Db2DataBind(name = "QuestSort.db2", layoutHash = 0xAD7072C6, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "sortName", type = Db2Type.STRING),
        @Db2Field(name = "uiOrderIndex", type = Db2Type.BYTE, signed = true)
})
public class QuestSort implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "SortName")
    private LocalizedString sortName;

    @Column(name = "UiOrderIndex")
    private Byte uiOrderIndex;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
