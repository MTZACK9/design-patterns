package com.mtzack9.gof.behavioral.observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable o) {
       if(o instanceof ObservableImpl obs){
           System.out.println("****************** ObserverImpl1 ******************");
           int state = obs.getState();
           double tendency = Math.sqrt(state) * Math.cos(state);
           System.out.println("Tendency: " + tendency);
           System.out.println("****************** ObserverImpl1 ******************");
       }
    }
}
