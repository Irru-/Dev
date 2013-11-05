package Smoothies;
import Factories.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class BananaSmoothie extends Smoothie {
    
    BeverageIngredientFactory sif;
    
    public BananaSmoothie(BeverageIngredientFactory sif)
    {
        this.sif = sif;
    }

    public String getDescription() {
        banana = sif.createBanana();
        return banana.getDescription();
    }

    public double cost() {
        return 1.50;
    }   
    
    public void prepare()
    {
        banana = sif.createBanana();
    }
    
}
