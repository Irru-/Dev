/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class BananaSmoothie extends Smoothie {
    
    SmoothieIngredientFactory sif;
    
    public BananaSmoothie(SmoothieIngredientFactory sif)
    {
        this.sif = sif;
    }

    @Override
    public String getDescription() {
        banana = sif.createBanana();
        return banana.getDescription();
    }

    @Override
    public double cost() {
        return 1.50;
    }   
    
    public void prepare()
    {
        banana = sif.createBanana();
    }
    
}
