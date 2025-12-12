package com.mtzack9.gof.creational.singletonbuilderprototype;


import com.mtzack9.gof.creational.singletonbuilderprototype.model.BankAccount;
import com.mtzack9.gof.creational.singletonbuilderprototype.repository.AccountRepositoryImpl;
import com.mtzack9.gof.creational.singletonbuilderprototype.utils.JsonSerializer;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        // Builder Design pattern
        /*
        Builder is a creational design pattern that lets you construct complex objects step by step. The pattern
        allows you to produce different types and representations of an object using the same construction code.
         */

        // Singleton Design pattern
        /*
        Singleton is a creational design pattern that lets you ensure that a class has only one instance,
        while providing a global access point to this instance.
        */

        JsonSerializer<BankAccount> bankAccountJsonSerializer = new JsonSerializer<>();
        AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();

        for (int i = 0; i < 10; i++) {
            new Thread(accountRepository::populateAccounts)
                    .start();
        }
        System.out.println("Type a char");
        System.in.read();

        List<BankAccount> bankAccounts = accountRepository.findAll();
        bankAccounts.stream().map(bankAccountJsonSerializer::toJson).forEach(System.out::println);


       /* System.out.println("============================");
        BankAccount account = accountRepository.findById(1l).orElse(null);
        if (account != null) {
            System.out.println(bankAccountJsonSerializer.toJson(account));
        }*/
    }
}
