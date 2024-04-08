package com.ux.gs2n.services.auth;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ux.gs2n.dao.account.AccountDaoImp;
import com.ux.gs2n.model.account.Account;
import com.ux.gs2n.util.MapperJsonImp;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImp implements IAccountService {
    @Autowired
    private AccountDaoImp dao;

    @Override
    @Transactional
    public String getAccount(String email, String encodePass) {
        Account account = dao.getAccount(email, encodePass);
        String json = MapperJsonImp.getInstance().mapToJson(account);
        return json;
    }

    @Override
    @Transactional
    public boolean save(Account account) {
        return dao.insert(account);
    }
}
