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
@Table(name = "names_reserved_locale")
@Db2DataBind(name = "NamesReservedLocale.db2", layoutHash = 0xC1403093, fields = {
        @Db2Field(name = "name", type = Db2Type.STRING_NOT_LOCALIZED),
        @Db2Field(name = "localeMask", type = Db2Type.BYTE)
})
public class NamesReservedLocale implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "LocaleMask")
    private Short localeMask;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
