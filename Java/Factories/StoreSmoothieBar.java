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
public class StoreSmoothieBar extends SmoothieBar{
    
    public Smoothie createSmoothie(String s, Smoothie sm){
        
        SmoothieIngredientFactory sif = new StoreIngredientFactory();
        
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
        }
        else
            return null;
    }
    
}
