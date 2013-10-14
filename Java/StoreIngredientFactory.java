/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class StoreIngredientFactory implements SmoothieIngredientFactory {
    
    public Banana createBanana()
    {
        return new FreshBanana();
    }
    
    public Mango createMango()
    {
        return new FreshMango();
    }
    
    public Orange createOrange()
    {
        return new FreshOrange();
    }
    
    public Strawberry createStrawberry()
    {
        return new FreshStrawberry();   
    }
    
}
