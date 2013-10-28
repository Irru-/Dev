/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class OrangeSmoothie extends Smoothie {
    
    SmoothieIngredientFactory sif;
    
    public OrangeSmoothie(SmoothieIngredientFactory sif)
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
