package com.mtzack9.gof.structural.decorator.decorators;

import com.mtzack9.gof.structural.decorator.components.Drink;

public class Hazelnut extends Decorator {

    private final Drink drink;

    public Hazelnut(Drink drink) {
        super(drink);
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+" with Hazelnut";
    }


    @Override
    public double cost() {
        return 1.2+drink.cost();
    }
}
