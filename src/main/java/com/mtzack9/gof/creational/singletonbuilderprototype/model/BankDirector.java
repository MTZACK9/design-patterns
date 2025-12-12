package com.mtzack9.gof.creational.singletonbuilderprototype.model;

public class BankDirector {

    public static BankAccount.AccountBuilder accountBuilder() {
        return new BankAccount.AccountBuilder();
    }
}
