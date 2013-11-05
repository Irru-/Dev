package Factories;

import Decorator.*;
import Juice.*;
import Smoothies.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nick
 */
public class CarBeverageBar extends BeverageBar {

    public Beverage createDrink(String s, Beverage sm) {
        
        BeverageIngredientFactory sif = new CarIngredientFactory();
        
        if(sm instanceof Smoothie)
            return createSmoothie(s, (Smoothie) sm, sif);
        if(sm instanceof Juice)
            return createJuice(s, (Juice) sm, sif);
        else
            return null;
    }
    
    public Smoothie createSmoothie(String s, Smoothie sm, 
            BeverageIngredientFactory sif) {
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
    
    public Juice createJuice(String s, Juice j,
            BeverageIngredientFactory sif){
        if(s.equals("Banana")) {
            j.setFruit(sif.createBanana());
            return j;            
        }
        if(s.equals("Orange")) {
            j.setFruit(sif.createOrange());
            return j;
        }
        if(s.equals("Strawberry")) {
            j.setFruit(sif.createStrawberry());
            return j;
        }
        if(s.equals("Mango")) {
            j.setFruit(sif.createMango());
            return j;
            
        } else {
            return null;
        }
    }
}
