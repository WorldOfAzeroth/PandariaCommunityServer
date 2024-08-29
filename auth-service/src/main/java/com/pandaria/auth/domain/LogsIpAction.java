package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "logs_ip_actions")
public class LogsIpAction {
    @Id
    @Column(name = "id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Column(name = "account_id", columnDefinition = "int UNSIGNED not null")
    private Long accountId;

    @Column(name = "character_guid", nullable = false)
    private Long characterGuid;

    @Column(name = "realm_id", columnDefinition = "int UNSIGNED not null")
    private Long realmId;

    @Column(name = "type", columnDefinition = "tinyint UNSIGNED not null")
    private Short type;

    @Column(name = "ip", nullable = false, length = 15)
    private String ip;

    @Lob
    @Column(name = "systemnote")
    private String systemnote;

    @Column(name = "unixtime", columnDefinition = "int UNSIGNED not null")
    private Long unixtime;

    @Column(name = "time", nullable = false)
    private Instant time;

    @Lob
    @Column(name = "comment")
    private String comment;

}