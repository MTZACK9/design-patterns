package com.mtzack9.gof.structural.adapter.computer;

public class Monitor implements VGA{
    @Override
    public void print(String message) {
        System.out.println("=============Monitor==============");
        System.out.println(message);
        System.out.println("=============Monitor==============");
    }
}
