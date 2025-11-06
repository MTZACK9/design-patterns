package com.mtzack9.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int state;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
    public int getState() {
        return state;
    }
}
