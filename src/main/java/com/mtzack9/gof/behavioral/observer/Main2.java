package com.mtzack9.gof.behavioral.observer;

public class Main2 {
    public static void main(String[] args) {
        /*
            Observer is a behavioral design pattern that lets you define a subscription mechanism
            to notify multiple objects about any events that happen to the object they’re observing.
        */

        ObservableImpl observable = new ObservableImpl();
        observable.subscribe(state -> {
            System.out.println("************************");
            System.out.println(state);
            System.out.println("************************");
        });
        observable.subscribe(state -> {
            System.out.println("2************************");
            System.out.println(state);
            System.out.println("2************************");
        });

        observable.setState(14);
    }
}
