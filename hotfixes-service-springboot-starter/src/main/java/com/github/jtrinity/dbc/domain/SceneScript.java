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
@Table(name = "scene_script")
@Db2DataBind(name = "SceneScript.db2", layoutHash = 0xC694B81E, fields = {
        @Db2Field(name = "firstSceneScriptID", type = Db2Type.SHORT),
        @Db2Field(name = "nextSceneScriptID", type = Db2Type.SHORT)
})
public class SceneScript implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "FirstSceneScriptID")
    private Short firstSceneScriptID;

    @Column(name = "NextSceneScriptID")
    private Short nextSceneScriptID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
