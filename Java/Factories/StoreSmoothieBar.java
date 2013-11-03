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
    
    public Smoothie createSmoothie(String s){
        
        Smoothie smoothie = new Smoothie();
        SmoothieIngredientFactory sif = new StoreIngredientFactory();
        
        if(s.equals("Banana")) {            
            //smoothie = new BananaSmoothie(sif);
            //smoothie = new Milk(smoothie);
            smoothie.setFruit(sif.createBanana());
            return smoothie;            
        }
        if(s.equals("Orange")) {
            //smoothie = new OrangeSmoothie(sif);
            //drink = new Milk(drink);
            smoothie.setFruit(sif.createOrange());
            return smoothie;
        }
        if(s.equals("Strawberry")) {
            //smoothie = new OrangeSmoothie(sif);
            //drink = new Milk(drink);
            smoothie.setFruit(sif.createStrawberry());
            return smoothie;
        }
        if(s.equals("Mango")) {
            //smoothie = new MangoSmoothie(sif);
            //drink = new Milk(drink);
            smoothie.setFruit(sif.createMango());
            return smoothie;
        }
        else
            return null;
    }
    
}
