package com.ux.gs2n.dao.account;

import com.ux.gs2n.dao.IDao;
import com.ux.gs2n.model.account.Account;

public interface IAccountDao extends IDao {
    // Lấy ra tài khoản khi đăng nhập
    Account getAccount(String email, String encodePass);

    boolean insert(Account account);
}
