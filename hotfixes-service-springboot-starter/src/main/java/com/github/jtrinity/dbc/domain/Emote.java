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
@Table(name = "emotes")
@Db2DataBind(name = "Emotes.db2", layoutHash = 0x14467F27, fields = {
        @Db2Field(name = "raceMask", type = Db2Type.LONG, signed = true),
        @Db2Field(name = "emoteSlashCommand", type = Db2Type.STRING_NOT_LOCALIZED),
        @Db2Field(name = "emoteFlags", type = Db2Type.INT),
        @Db2Field(name = "spellVisualKitID", type = Db2Type.INT),
        @Db2Field(name = "animID", type = Db2Type.SHORT, signed = true),
        @Db2Field(name = "emoteSpecProc", type = Db2Type.BYTE),
        @Db2Field(name = "classMask", type = Db2Type.INT, signed = true),
        @Db2Field(name = "emoteSpecProcParam", type = Db2Type.INT),
        @Db2Field(name = "eventSoundID", type = Db2Type.INT)
})
public class Emote implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "RaceMask")
    private Long raceMask;

    @Column(name = "EmoteSlashCommand")
    private String emoteSlashCommand;

    @Column(name = "EmoteFlags")
    private Integer emoteFlags;

    @Column(name = "SpellVisualKitID")
    private Integer spellVisualKitID;

    @Column(name = "AnimID")
    private Short animID;

    @Column(name = "EmoteSpecProc")
    private Byte emoteSpecProc;

    @Column(name = "ClassMask")
    private Integer classMask;

    @Column(name = "EmoteSpecProcParam")
    private Integer emoteSpecProcParam;

    @Column(name = "EventSoundID")
    private Integer eventSoundID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
