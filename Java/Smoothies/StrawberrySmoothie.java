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
public class StrawberrySmoothie extends Smoothie {
    
    BeverageIngredientFactory sif;
    
    public StrawberrySmoothie(BeverageIngredientFactory sif)
    {
        this.sif = sif;
    }

    public String getDescription() {
        strawberry = sif.createStrawberry();
        return strawberry.getDescription();
    }

    public double cost() {
        return 1.50;
    }   
    
    public void prepare()
    {
        strawberry = sif.createStrawberry();
    }
    
}
