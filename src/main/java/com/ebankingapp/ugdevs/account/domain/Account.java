package com.ebankingapp.ugdevs.account.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@ApiModel(description = "Details about Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Primary Id for Account")
    private Long accountId;
    private String accountNumber;
    private LocalDate accountOpenedDate;
    private Double balance;
    @JsonIgnoreProperties("accounts")
    @ManyToOne
    @JoinColumn(name = "customer_Id")
    private Customer customer;

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountOpenedDate=" + accountOpenedDate +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDate getAccountOpenedDate() {
        return accountOpenedDate;
    }

    public void setAccountOpenedDate(LocalDate accountOpenedDate) {
        this.accountOpenedDate = accountOpenedDate;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void deposit() {

    }

    public void withDraw() {

    }

    public void chargeFees() {

    }


}