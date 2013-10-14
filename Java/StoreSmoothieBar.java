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
        
        Smoothie smoothie = null;
        SmoothieIngredientFactory sif = new StoreIngredientFactory();
        
        if(s.equals("Banana")) {            
            smoothie = new BananaSmoothie(sif);
            smoothie = new Milk(smoothie);
            return smoothie;            
            //Smoothie drink = sif.createBanana();
            //drink = new Milk(drink);
            //return drink;
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
