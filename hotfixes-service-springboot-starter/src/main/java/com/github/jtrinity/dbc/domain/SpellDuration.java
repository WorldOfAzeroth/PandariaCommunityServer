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
@Table(name = "spell_duration")
@Db2DataBind(name = "SpellDuration.db2", layoutHash = 0x0D6C9082, fields = {
        @Db2Field(name = "duration", type = Db2Type.INT, signed = true),
        @Db2Field(name = "maxDuration", type = Db2Type.INT, signed = true),
        @Db2Field(name = "durationPerLevel", type = Db2Type.INT)
})
public class SpellDuration implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Duration")
    private Integer duration;

    @Column(name = "MaxDuration")
    private Integer maxDuration;

    @Column(name = "DurationPerLevel")
    private Integer durationPerLevel;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
