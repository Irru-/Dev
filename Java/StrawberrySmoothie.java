/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class StrawberrySmoothie extends Smoothie {
    
    SmoothieIngredientFactory sif;
    
    public StrawberrySmoothie(SmoothieIngredientFactory sif)
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
