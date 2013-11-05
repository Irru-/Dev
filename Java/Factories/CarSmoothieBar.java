package Factories;

import Decorator.*;
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

    public Smoothie createDrink(String s, Beverage sm) {
        
        SmoothieIngredientFactory sif = new CarIngredientFactory();
        
        if(sm instanceof Smoothie)
            return createSmoothie(s, (Smoothie) sm, sif);
        else
            return null;
    }
    
    public Smoothie createSmoothie(String s, Smoothie sm, 
            SmoothieIngredientFactory sif) {
        if(s.equals("Banana")) {
            sm.setFruit(sif.createBanana());
            return sm;            
        }
        if(s.equals("Orange")) {
            sm.setFruit(sif.createOrange());
            return sm;
        }
        if(s.equals("Strawberry")) {
            sm.setFruit(sif.createStrawberry());
            return sm;
        }
        if(s.equals("Mango")) {
            sm.setFruit(sif.createMango());
            return sm;
            
        } else {
            return null;
        }
    }
}
