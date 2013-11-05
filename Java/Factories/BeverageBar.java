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

    public Beverage orderSmoothie(String s, Beverage sm) {
        Beverage smoothie;

        smoothie = createDrink(s, sm);

        return smoothie;
    }

    protected abstract Beverage createDrink(String s, Beverage sm);
}
