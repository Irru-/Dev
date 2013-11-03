package Factories;

import Smoothies.Smoothie;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nick
 */
public abstract class SmoothieBar {

    public Smoothie orderSmoothie(String s, Smoothie sm) {
        Smoothie smoothie;

        smoothie = createSmoothie(s, sm);

        return smoothie;
    }

    protected abstract Smoothie createSmoothie(String s, Smoothie sm);
}
