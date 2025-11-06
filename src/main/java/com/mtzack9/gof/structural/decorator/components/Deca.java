package com.mtzack9.gof.structural.decorator.components;

public class Deca extends Drink{

    public Deca(){
        super.setDescription("Deca");
    }

    @Override
    public double cost() {
        return 8;
    }
}
