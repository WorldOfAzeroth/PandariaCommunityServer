package com.github.jtrinity.dbc.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2LocaleId.class)
@Entity
@Table(name = "battlemaster_list_locale")
public class BattlemasterListLocale {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @Column(name = "locale", nullable = false, length = 4)
    private String locale;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name_lang")
    private String nameLang;

    @Lob
    @Column(name = "GameType_lang")
    private String gametypeLang;

    @Lob
    @Column(name = "ShortDescription_lang")
    private String shortdescriptionLang;

    @Lob
    @Column(name = "LongDescription_lang")
    private String longdescriptionLang;

}