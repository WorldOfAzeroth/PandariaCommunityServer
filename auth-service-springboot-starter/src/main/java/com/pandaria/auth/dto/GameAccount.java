package com.pandaria.auth.dto;

import com.pandaria.auth.domain.Account;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GameAccount {

    private Long id;
    private String username;
    private String email;
    private boolean banded;
    private boolean permanentlyBanned;
    private Long unbandate;

    public GameAccount(Account account) {
        this(account.getId(), account.getUsername(), account.getEmail(), false, false,null);
    }

}
