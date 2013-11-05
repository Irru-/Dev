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
public class OrangeJuice extends Juice {
    
    BeverageIngredientFactory sif;
    
    public OrangeJuice(BeverageIngredientFactory sif)
    {
        this.sif = sif;
    }

    public String getDescription() {
        orange = sif.createOrange();
        return orange.getDescription();
    }

    public double cost() {
        return 1.50;
    }   
    
    public void prepare()
    {
        orange = sif.createOrange();
    }
    
}
