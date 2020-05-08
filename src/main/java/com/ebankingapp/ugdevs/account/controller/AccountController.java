package com.ebankingapp.ugdevs.account.controller;

import com.ebankingapp.ugdevs.account.domain.Account;

import java.util.List;

public interface AccountController {
    List<Account> getAccounts();

    Account getAccount(Long accountId);

    Account addAccount(Account account);

    Account UpdateAccount(Long accountId, Account accountUpdate);

    void deleteAccount(Long accountId);

}
