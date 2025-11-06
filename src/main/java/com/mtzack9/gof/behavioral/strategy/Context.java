package com.mtzack9.gof.behavioral.strategy;

public class Context {
    private IStrategy strategy;

    public Context() {
        this.strategy = new DefaultStrategy();
    }
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void apply() {
        System.out.println("************");
        strategy.applyStrategy();
        System.out.println("************");
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
