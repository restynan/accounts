package com.ebankingapp.ugdevs.account.service.impl;

import com.ebankingapp.ugdevs.account.domain.Account;
import com.ebankingapp.ugdevs.account.repository.AccountRepository;
import com.ebankingapp.ugdevs.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAccounts() {

        return accountRepository.findAll();
    }

    @Override
    public Account getAccount(Long accountId) {

        return accountRepository.findById(accountId).get();
    }

    @Override
    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }


    @Override
    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }


    @Override
    public void deleteAccount(Long accountId) {
        accountRepository.deleteById(accountId);
    }
}
