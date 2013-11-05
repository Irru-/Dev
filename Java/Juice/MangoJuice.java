package Juice;
import Smoothies.*;
import Factories.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class MangoJuice extends Juice {
    
    SmoothieIngredientFactory sif;
    
    public MangoJuice(SmoothieIngredientFactory sif)
    {
        this.sif = sif;
    }

    public String getDescription() {
        mango = sif.createMango();
        return mango.getDescription();
    }

    public double cost() {
        return 1.50;
    }   
    
    public void prepare()
    {
        mango = sif.createMango();
    }
    
}
