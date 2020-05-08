package com.ebankingapp.ugdevs.account.domain;


import javax.persistence.Entity;

@Entity
public class CheckingAccount extends Account {

    private double overDraftLimt;

    public double getOverDraftLimt() {
        return overDraftLimt;
    }

    public void setOverDraftLimt(double overDraftLimt) {
        this.overDraftLimt = overDraftLimt;
    }
}
