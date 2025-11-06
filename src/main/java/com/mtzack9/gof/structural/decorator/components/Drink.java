package com.mtzack9.gof.structural.decorator.components;

public abstract class Drink  {
    private String description;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
