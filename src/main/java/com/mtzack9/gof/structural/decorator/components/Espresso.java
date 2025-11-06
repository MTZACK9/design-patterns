package com.mtzack9.gof.structural.decorator.components;

public class Espresso extends Drink{

    public Espresso(){
        super.setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 12;
    }
}
