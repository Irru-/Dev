/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class CarIngredientFactory implements SmoothieIngredientFactory{
    
    public Banana createBanana()
    {
        return new CannedBanana();
    }
    
    public Mango createMango()
    {
        return new CannedMango();
    }
    
    public Orange createOrange()
    {
        return new CannedOrange();
    }
    
    public Strawberry createStrawberry()
    {
        return new CannedStrawberry();   
    }
    
}
