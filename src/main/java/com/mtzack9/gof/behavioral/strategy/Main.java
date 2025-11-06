package com.mtzack9.gof.behavioral.strategy;

public class Main {
    static void main(String[] args) {
         /*
            Strategy is a behavioral design pattern that lets you define a family of algorithms,
            put each of them into a separate class, and make their objects interchangeable.
        */
        Context context = new Context();
        context.apply();
        context.setStrategy(new Strategy1());
        context.apply();
        context.setStrategy(new Strategy3());
        context.apply();

        System.out.println("-----------------------");
        Context context2 = new Context(new Strategy2());
        context2.apply();
    }
}
