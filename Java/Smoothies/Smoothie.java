package Smoothies;

import Ingredients.Banana;
import Ingredients.Mango;
import Ingredients.Orange;
import Ingredients.Strawberry;

public class Smoothie {
 
	String description = "Unknown Smoothie";
        Mango mango;
        Banana banana;
        Orange orange;
        Strawberry strawberry;
        double cost;
	 
	public String getDescription()
        {
            return description;
        }
	 
	public double cost()
        {
            return cost;
        }
        
        public void setFruit(Smoothie s)
        {
            if(s instanceof Banana)
            {
                banana = (Banana) s;
                description = banana.getDescription();
                cost = banana.cost();
            }
            if(s instanceof Orange)
            {
                orange = (Orange) s;
                description = orange.getDescription();
                cost = orange.cost();
            }
            if(s instanceof Strawberry)
            {
                strawberry = (Strawberry) s;
                description = strawberry.getDescription();
                cost = strawberry.cost();
            }
            if(s instanceof Mango)
            {
                mango = (Mango) s;
                description = mango.getDescription();
                cost = mango.cost();
            }
        }
}
 
