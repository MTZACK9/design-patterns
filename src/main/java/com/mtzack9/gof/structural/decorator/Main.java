package com.mtzack9.gof.structural.decorator;


import com.mtzack9.gof.structural.decorator.components.Drink;
import com.mtzack9.gof.structural.decorator.components.Sumatra;
import com.mtzack9.gof.structural.decorator.decorators.Caramel;
import com.mtzack9.gof.structural.decorator.decorators.Chocolate;
import com.mtzack9.gof.structural.decorator.decorators.Hazelnut;

public class Main {
    public static void main(String[] args) {

        /*
            Decorator is a structural design pattern that lets you attach new behaviors to objects
            by placing these objects inside special wrapper objects that contain the behaviors.
        */
        Drink drink;

        drink = new Sumatra();

        System.out.println(drink.getDescription());
        System.out.println(drink.cost());
        System.out.println("---------------------");
        drink = new Chocolate(drink);
        System.out.println(drink.getDescription());
        System.out.println(drink.cost());
        System.out.println("---------------------");
        drink = new Caramel(drink);
        System.out.println(drink.getDescription());
        System.out.println(drink.cost());
        System.out.println("---------------------");
        drink = new Hazelnut(drink);
        System.out.println(drink.getDescription());
        System.out.println(drink.cost());
    }
}
