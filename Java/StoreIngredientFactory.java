/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class StoreIngredientFactory implements SmoothieIngredientFactory {
    
    public Banana createBanana() {
        return new FreshBanana();
    }

    
    public Mango createMango() {
        return new FreshMango();
    }

    
    public Strawberry createStrawberry() {
        return new FreshStrawberry();
    }

   
    public Orange createOrange() {
        return new FreshOrange();
    }

    
    public Milk createMilk() {
        return new WholeMilk();
    }

   
    public IceCubes createIceCubes() {
        return new ShavedIce();
    }

  
    public Icecream createIcecream() {
        return new VanillaIce();
    }


    public WhippedCream createWhippedCream() {
        return new WholeWhipped();
    }
    
    
    
}
