package com.mtzack9.gof.structural.decorator.decorators;

import com.mtzack9.gof.structural.decorator.components.Drink;

public class Chocolate extends Decorator {

    private final Drink drink;

    public Chocolate(Drink drink) {
        super(drink);
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+" with Chocolate";
    }


    @Override
    public double cost() {
        return 1.2+drink.cost();
    }
}
