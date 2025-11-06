package com.mtzack9.gof.structural.composite;

public abstract class Component {
    protected String name;
    protected int level;

    protected Component(String name) {
        this.name = name;
    }
    public abstract void print();
}
