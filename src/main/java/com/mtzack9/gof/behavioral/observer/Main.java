package com.mtzack9.gof.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        /*
            Observer is a behavioral design pattern that lets you define a subscription mechanism
            to notify multiple objects about any events that happen to the object they’re observing.
        */

        ObservableImpl observable = new ObservableImpl();
        Observer obs1 = new ObserverImpl1();
        Observer obs2 = new ObserverImpl2();

        observable.subscribe(obs1);
        observable.subscribe(obs2);
        observable.setState(14);
    }
}
