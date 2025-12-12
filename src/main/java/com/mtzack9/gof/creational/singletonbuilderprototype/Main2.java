package com.mtzack9.gof.creational.singletonbuilderprototype;

import com.mtzack9.gof.creational.singletonbuilderprototype.enums.AccountStatus;
import com.mtzack9.gof.creational.singletonbuilderprototype.enums.AccountType;
import com.mtzack9.gof.creational.singletonbuilderprototype.model.BankAccount;
import com.mtzack9.gof.creational.singletonbuilderprototype.model.BankDirector;
import com.mtzack9.gof.creational.singletonbuilderprototype.model.Customer;

public class Main2 {
    public static void main(String[] args) {
        /*
        Prototype is a creational design pattern that lets you copy existing objects
        without making your code dependent on their classes.
        * */

        Customer customer = new Customer();
        customer.setId("1");
        customer.setName("Zakaria");

        BankAccount account1 = BankDirector.accountBuilder()
                .accountId(1L)
                .type(AccountType.SAVING_ACCOUNT)
                .status(AccountStatus.CREATED)
                .currency("USD")
                .balance(100000)
                .customer(customer)
                .build();

        BankAccount account2 = account1.clone();
        account2.setAccountId(2L);
        System.out.println(account1);
        System.out.println(account2);

        account1.getCustomer().setName("Someone");
        account2.getCustomer().setId("2");
        System.out.println(account1);
        System.out.println(account2);
    }
}
