package com.mtzack9.gof.creational.singletonbuilderprototype.model;

import com.mtzack9.gof.creational.singletonbuilderprototype.enums.AccountStatus;
import com.mtzack9.gof.creational.singletonbuilderprototype.enums.AccountType;

public class BankAccount implements Cloneable {
    private Long accountId;
    private double balance;
    private String currency;
    private AccountType type;
    private AccountStatus status;
    private Customer customer;

    public BankAccount() {}

    public BankAccount(Long accountId, double balance, String currency, AccountType type, AccountStatus status, Customer customer) {
        this.accountId = accountId;
        this.balance = balance;
        this.currency = currency;
        this.type = type;
        this.status = status;
        this.customer = customer;
    }

    public Long getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public AccountType getType() {
        return type;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", customer=" + customer +
                '}';
    }


    @Override
    public BankAccount clone() {
        try {
            BankAccount account = (BankAccount) super.clone();
            account.setCustomer(this.customer.clone());
            return account;
        } catch (CloneNotSupportedException _) {
            throw new AssertionError();
        }
    }

    public static class AccountBuilder {
        private final BankAccount bankAccount = new BankAccount();

        public AccountBuilder accountId(Long accountId) {
            bankAccount.accountId = accountId;
            return this;
        }

        public AccountBuilder balance(double balance) {
            bankAccount.balance = balance;
            return this;
        }

        public AccountBuilder currency(String currency) {
            bankAccount.currency = currency;
            return this;
        }

        public AccountBuilder type(AccountType type) {
            bankAccount.type = type;
            return this;
        }

        public AccountBuilder status(AccountStatus status) {
            if(bankAccount.getType().equals(AccountType.CURRENT_ACCOUNT)) {
                bankAccount.status = status;
            } else {
                bankAccount.status = AccountStatus.ACTIVATED;
            }
            return this;
        }

        public AccountBuilder customer(Customer customer) {
            bankAccount.customer = customer;
            return this;
        }

        public BankAccount build() {
            return bankAccount;
        }
    }

}
