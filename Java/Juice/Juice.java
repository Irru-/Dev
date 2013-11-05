/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Juice;
import Decorator.*;
import Ingredients.Banana;
import Ingredients.Mango;
import Ingredients.Orange;
import Ingredients.Strawberry;

/**
 *
 * @author Nick
 */
public class Juice extends Beverage{
    
    String desc = "";
        Mango mango;
        Banana banana;
        Orange orange;
        Strawberry strawberry;
        double cost;
	 
	public String getDescription()
        {
            return desc;
        }
	 
	public double cost()
        {
            return cost;
        }
        
        public void setFruit(Beverage j)
        {
            if(j instanceof Banana)
            {
                banana = (Banana) j;
                if(!desc.matches(""))
                    desc = desc + ", " + banana.getDescription();
                if(desc.matches(""))
                    desc = banana.getDescription();
                cost = cost + banana.cost();
            }
            if(j instanceof Orange)
            {
                orange = (Orange) j;
                if(!desc.matches(""))
                    desc = desc + ", " + orange.getDescription();
                if(desc.matches(""))
                    desc = orange.getDescription();
                cost = cost + orange.cost();
            }
            if(j instanceof Strawberry)
            {
                strawberry = (Strawberry) j;
                if(!desc.matches(""))
                    desc = desc + ", " + strawberry.getDescription();
                if(desc.matches(""))
                    desc = strawberry.getDescription();
                cost = cost + strawberry.cost();
            }
            if(j instanceof Mango)
            {
                mango = (Mango) j;
                if(!desc.matches(""))
                    desc = desc + ", " + mango.getDescription();
                if(desc.matches(""))
                    desc = mango.getDescription();
                cost = cost + mango.cost();
            }
        }
    
}
