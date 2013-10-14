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
        if(s.equals("Banana")) {
            Smoothie drink = new CannedBanana();
            drink = new Icecream(drink);
            return drink;
        }
        if(s.equals("Orange")) {
            Smoothie drink = new CannedOrange();
            drink = new Icecream(drink);
            return drink;
        }
        if(s.equals("Strawberry")) {
            Smoothie drink = new CannedStrawberry();
            drink = new Icecream(drink);
            return drink;
        }
        if(s.equals("Mango")) {
            Smoothie drink = new CannedMango();
            drink = new Icecream(drink);
            return drink;
        }
        else
            return null;
    }
    
}
