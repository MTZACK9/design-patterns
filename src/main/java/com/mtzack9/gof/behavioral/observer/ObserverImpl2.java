package com.mtzack9.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Double> history = new ArrayList<>();
    @Override
    public void update(Observable o) {
        if (o instanceof ObservableImpl obs) {
            System.out.println("****************** ObserverImpl2 ******************");
            int state = obs.getState();
            history.add((double) state);
            double sum = history.stream().mapToDouble(Double::doubleValue).sum();
            System.out.println("AVG: " + sum / history.size());
            System.out.println("****************** ObserverImpl2 ******************");
        }

    }
}
