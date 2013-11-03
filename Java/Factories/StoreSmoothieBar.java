package Factories;


import Factories.StoreIngredientFactory;
import Factories.SmoothieIngredientFactory;
import Smoothies.Smoothie;
import Smoothies.OrangeSmoothie;
import Smoothies.MangoSmoothie;
import Smoothies.BananaSmoothie;

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
        
        //Smoothie smoothie = new Smoothie();
        SmoothieIngredientFactory sif = new StoreIngredientFactory();
        
        if(s.equals("Banana")) {            
            //smoothie = new BananaSmoothie(sif);
            //smoothie = new Milk(smoothie);
            sm.setFruit(sif.createBanana());
            return sm;            
        }
        if(s.equals("Orange")) {
            //smoothie = new OrangeSmoothie(sif);
            //drink = new Milk(drink);
            sm.setFruit(sif.createOrange());
            return sm;
        }
        if(s.equals("Strawberry")) {
            //smoothie = new OrangeSmoothie(sif);
            //drink = new Milk(drink);
            sm.setFruit(sif.createStrawberry());
            return sm;
        }
        if(s.equals("Mango")) {
            //smoothie = new MangoSmoothie(sif);
            //drink = new Milk(drink);
            sm.setFruit(sif.createMango());
            return sm;            
        }
        else
            return null;
    }
    
}
