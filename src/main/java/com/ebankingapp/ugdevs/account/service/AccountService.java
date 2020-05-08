package com.ebankingapp.ugdevs.account.service;

import com.ebankingapp.ugdevs.account.domain.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> getAccounts();

    Account getAccount(Long accountId);

    Account addAccount(Account account);

    Account updateAccount(Account account);


    void deleteAccount(Long accountId);


}
