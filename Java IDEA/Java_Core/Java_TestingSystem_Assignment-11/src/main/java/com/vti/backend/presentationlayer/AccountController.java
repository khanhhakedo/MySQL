package com.vti.backend.presentationlayer;

import com.vti.backend.businesslayer.AccountService;
import com.vti.entity.Account;

import java.sql.SQLException;
import java.util.List;

public class AccountController {
    private AccountService accountService;

    public AccountController() {
        accountService= new AccountService();
    }

    public List<Account> getListAccounts() throws SQLException, ClassNotFoundException {
        // validation TODO
        return accountService.getListAccounts();
    }
}
