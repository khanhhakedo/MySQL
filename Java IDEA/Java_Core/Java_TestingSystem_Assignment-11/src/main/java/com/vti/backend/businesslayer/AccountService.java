package com.vti.backend.businesslayer;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.entity.Account;

import java.sql.SQLException;
import java.util.List;

public class AccountService {
    private AccountRepository repository;

    public AccountService() {
        repository = new AccountRepository();
    }

    public List<Account> getListAccounts() throws ClassNotFoundException,
            SQLException {
        // logic service
        return repository.getLitsAccounts();
    }
}
