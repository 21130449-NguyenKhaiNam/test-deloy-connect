package com.ux.gs2n.controller.api.auth;

import com.ux.gs2n.controller.IPathApi;
import com.ux.gs2n.model.account.Account;
import com.ux.gs2n.services.auth.AccountServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(IPathApi.PATH_AUTH)
public class Register {
    @Autowired
    private AccountServiceImp accountService;

    @PostMapping("/register")
    public boolean registerAccount(@RequestBody Account account) {
        return accountService.save(account);
    }
}
