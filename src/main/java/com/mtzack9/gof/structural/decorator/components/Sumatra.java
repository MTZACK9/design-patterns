package com.mtzack9.gof.structural.decorator.components;

public class Sumatra extends Drink{

    public Sumatra(){
        super.setDescription("Sumatra");
    }

    @Override
    public double cost() {
        return 6;
    }
}
