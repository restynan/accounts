package com.ebankingapp.ugdevs.account.domain;

import javax.persistence.Entity;

@Entity
public class SavingsAccount extends Account {
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest() {

    }
}
