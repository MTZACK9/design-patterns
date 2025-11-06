package com.mtzack9.gof.behavioral.observer;

public interface Observable {
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void notifyObservers();
}
