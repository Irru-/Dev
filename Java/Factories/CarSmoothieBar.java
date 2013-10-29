package Factories;

import Smoothies.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nick
 */
public class CarSmoothieBar extends SmoothieBar {

    public Smoothie createSmoothie(String s) {

        Smoothie smoothie;
        SmoothieIngredientFactory sif = new CarIngredientFactory();

        if (s.equals("Banana")) {
            smoothie = new BananaSmoothie(sif);
            return smoothie;
        }
        if (s.equals("Orange")) {
            smoothie = new OrangeSmoothie(sif);
            return smoothie;
        }
        if (s.equals("Strawberry")) {
            smoothie = new StrawberrySmoothie(sif);
            return smoothie;
        }
        if (s.equals("Mango")) {
            smoothie = new MangoSmoothie(sif);
            return smoothie;
        } else {
            return null;
        }
    }
}
