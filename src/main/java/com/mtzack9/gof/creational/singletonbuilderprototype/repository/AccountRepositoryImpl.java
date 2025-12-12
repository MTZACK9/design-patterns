package com.mtzack9.gof.creational.singletonbuilderprototype.repository;

import com.mtzack9.gof.creational.singletonbuilderprototype.enums.AccountStatus;
import com.mtzack9.gof.creational.singletonbuilderprototype.enums.AccountType;
import com.mtzack9.gof.creational.singletonbuilderprototype.model.BankAccount;
import com.mtzack9.gof.creational.singletonbuilderprototype.model.BankDirector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class AccountRepositoryImpl implements AccountRepository {

    private static AccountRepositoryImpl accountRepository;

    static {
        System.out.println("Singleton instantiation of AccountRepositoryImpl");
        accountRepository = new AccountRepositoryImpl();
    }

    private AccountRepositoryImpl() {
    }

    private final Map<Long, BankAccount> accounts = new HashMap<>();
    private long accountsCounter = 0;

    @Override
    public synchronized BankAccount save(BankAccount bankAccount) {
        Long accountId;
       // synchronized (this) {
            accountId = ++accountsCounter;
            bankAccount.setAccountId(accountId);
            accounts.put(accountId, bankAccount);
        //}

        return bankAccount;
    }

    @Override
    public List<BankAccount> findAll() {
        return accounts.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        BankAccount bankAccount = accounts.get(id);
        if (bankAccount == null) {
            return Optional.empty();
        }
        return Optional.of(bankAccount);
    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {
        return accounts.values().stream().filter(predicate).toList();
    }

    @Override
    public BankAccount update(BankAccount bankAccount) {
        accounts.put(bankAccount.getAccountId(), bankAccount);
        return bankAccount;
    }

    @Override
    public void deleteById(Long id) {
        accounts.remove(id);
    }

    public void populateAccounts() {
        for (int i = 0; i < 10; i++) {
            BankAccount bankAccount = BankDirector.accountBuilder()
                    .balance(10000 + Math.random() * 90000)
                    .type(Math.random() > 0.5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
                    .status(Math.random() > 0.5 ? AccountStatus.ACTIVATED : AccountStatus.CREATED)
                    .currency("USD")
                    .build();
            save(bankAccount);

        }
        System.out.println("**************************");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Accounts Count: " + accountsCounter);
        System.out.println("Size of accounts: " + accounts.size());
        System.out.println("**************************");

    }

    public synchronized static AccountRepositoryImpl getInstance() {
        /*if (accountRepository == null) {
            System.out.println("Singleton instantiation of AccountRepositoryImpl");
            accountRepository = new AccountRepositoryImpl();
            accountRepository.populateAccounts();
        }*/
        return accountRepository;
    }
}
