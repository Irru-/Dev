package Bars;


import Factories.CarIngredientFactory;
import Factories.SmoothieIngredientFactory;
import Smoothies.Smoothie;
import Smoothies.OrangeSmoothie;
import Smoothies.StrawberrySmoothie;
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
public class CarSmoothieBar extends SmoothieBar{
    
    public Smoothie createSmoothie(String s){
        
        Smoothie smoothie = null;
        SmoothieIngredientFactory sif = new CarIngredientFactory();
        
        if(s.equals("Banana")) {
            smoothie = new BananaSmoothie(sif);
            //drink = new Icecream(drink);
            return smoothie;
        }
        if(s.equals("Orange")) {
            smoothie = new OrangeSmoothie(sif);
            //drink = new Icecream(drink);
            return smoothie;
        }
        if(s.equals("Strawberry")) {
            smoothie = new StrawberrySmoothie(sif);
            //drink = new Icecream(drink);
            return smoothie;
        }
        if(s.equals("Mango")) {
            smoothie = new MangoSmoothie(sif);
            //drink = new Icecream(drink);
            return smoothie;
        }
        else
            return null;
    }
    
}
