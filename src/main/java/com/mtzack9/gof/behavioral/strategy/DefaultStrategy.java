package com.mtzack9.gof.behavioral.strategy;

public class DefaultStrategy implements IStrategy {
    @Override
    public void applyStrategy() {
        System.out.println("Applied default strategy");
    }
}
