package Factories;

import Smoothies.Smoothie;
import Decorator.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nick
 */
public abstract class BeverageBar {

    public Smoothie orderSmoothie(String s, Beverage sm) {
        Smoothie smoothie;

        smoothie = createDrink(s, sm);

        return smoothie;
    }

    protected abstract Smoothie createDrink(String s, Beverage sm);
}
