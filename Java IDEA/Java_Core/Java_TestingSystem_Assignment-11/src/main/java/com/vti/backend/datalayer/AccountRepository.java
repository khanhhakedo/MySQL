package com.vti.backend.datalayer;

import com.vti.entity.Account;
import com.vti.ultis.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    private JDBCUtils jdbcUtils;

    public AccountRepository() {
        jdbcUtils = new JDBCUtils();
    }

    public List<Account> getLitsAccounts() throws ClassNotFoundException,
            SQLException {

        List<Account> accounts = new ArrayList<>();

        // get connection
        Connection connection = jdbcUtils.getConnection();

        // Create a statement object
        String sql = "SELECT AccountID,Username, Email FROM `Account`";
        Statement statement = connection.createStatement();

        // execute query
        ResultSet resultSet = statement.executeQuery(sql);

        // handling result set
        while (resultSet.next()) {
            Account account = new Account(resultSet.getInt("AccountID"),
                    resultSet.getString("Username"),
                    resultSet.getString("Email"));

            accounts.add(account);

        }

        jdbcUtils.disconnect();

        return accounts;
    }
}
