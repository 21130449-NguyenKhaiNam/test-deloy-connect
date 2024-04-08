package com.ux.gs2n.dao.account;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ux.gs2n.model.account.Account;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImp implements IAccountDao {
    @Autowired
    private static EntityManager entityManager;
    private static final Session currentSession = entityManager.unwrap(Session.class);;

    @Override
    public Account getAccount(String email, String encodePass) {
        Query<Account> query = currentSession.createQuery("from Account where email = :email", Account.class);
        query.setParameter("email", email);
        List<Account> result = query.getResultList();
        if (result.size() == 1) {
            return result.get(0);
        } else {
            return null;
        }
    }

    @Override
    public boolean insert(Account account) {
        Account savedAccount = (Account) currentSession.save(account);
        return savedAccount != null;
    }
}
