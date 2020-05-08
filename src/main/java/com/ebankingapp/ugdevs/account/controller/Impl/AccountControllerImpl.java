package com.ebankingapp.ugdevs.account.controller.Impl;

import com.ebankingapp.ugdevs.account.controller.AccountController;
import com.ebankingapp.ugdevs.account.domain.Account;
import com.ebankingapp.ugdevs.account.service.AccountService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountControllerImpl implements AccountController {
    @Autowired
    private AccountService accountService;

    @ApiOperation(value = "Get all students", notes = "", response = Account.class)
    @GetMapping(produces = "application/json")
    public List<Account> getAccounts() {

        return accountService.getAccounts();
    }

    @ApiOperation(value = "Find account by id", notes = "provide account id", response = Account.class)
    @GetMapping(value = "/account/{accountId}", produces = "application/json")
    public Account getAccount(@ApiParam(value = "Id value for the Account you need to retrive", required = true) @PathVariable Long accountId) {

        return accountService.getAccount(accountId);
    }

    @ApiOperation(value = "Add a new account", notes = "provide account number,opened date, balance and customer Id ", response = Account.class)
    @PostMapping(value = "/account", consumes = "application/json", produces = "application/json")
    public Account addAccount(@ApiParam(value = "Account details", required = true) @RequestBody Account account) {

        return accountService.addAccount(account);
    }

    @ApiOperation(value = "Update Account", notes = "provide account details ", response = Account.class)
    @PutMapping(value = "/account/{accountId}", consumes = "application/json", produces = "application/json")
    public Account UpdateAccount(@PathVariable Long accountId, @RequestBody Account accountUpdate) {
        Account accountExisting = accountService.getAccount(accountId);
        BeanUtils.copyProperties(accountUpdate, accountExisting, "accountId");
        return accountService.updateAccount(accountExisting);
        //return null;
    }

    @ApiOperation(value = "delete account by id", notes = "provide account id", response = Account.class)
    @DeleteMapping("/account/{accountId}")
    public void deleteAccount(@ApiParam(value = "Id value for the Account you need to delete", required = true) @PathVariable Long accountId) {
        accountService.deleteAccount(accountId);
    }

}
