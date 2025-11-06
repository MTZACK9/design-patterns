package com.mtzack9.gof.structural.decorator.decorators;

import com.mtzack9.gof.structural.decorator.components.Drink;

public class Caramel extends Decorator {

    private final Drink drink;

    public Caramel(Drink drink) {
        super(drink);
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+" with Caramel";
    }


    @Override
    public double cost() {
        return 0.8+drink.cost();
    }
}
