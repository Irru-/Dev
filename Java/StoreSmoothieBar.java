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
        
        if(s.equals("Banana")) {            
            Smoothie drink = new FreshBanana();
            drink = new Milk(drink);
            return drink;
        }
        if(s.equals("Orange")) {
            Smoothie drink = new FreshOrange();
            drink = new Milk(drink);
            return drink;
        }
        if(s.equals("Strawberry")) {
            Smoothie drink = new FreshStrawberry();
            drink = new Milk(drink);
            return drink;
        }
        if(s.equals("Mango")) {
            Smoothie drink = new FreshMango();
            drink = new Milk(drink);
            return drink;
        }
        else
            return null;
    }
    
}
