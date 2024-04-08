package com.ux.gs2n.services.auth;

import com.ux.gs2n.model.account.Account;

public interface IAccountService {
    String getAccount(String email, String encodePass);

    boolean save(Account account);
}
