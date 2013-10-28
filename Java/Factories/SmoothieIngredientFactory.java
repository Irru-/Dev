package Factories;


import Ingredients.Strawberry;
import Ingredients.Mango;
import Ingredients.Orange;
import Ingredients.Banana;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public interface SmoothieIngredientFactory {
    
    public Banana createBanana();
    public Mango createMango();
    public Orange createOrange();
    public Strawberry createStrawberry();
    
}
