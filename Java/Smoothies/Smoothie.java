package Smoothies;


import Ingredients.Strawberry;
import Ingredients.Mango;
import Ingredients.Orange;
import Ingredients.Banana;

public abstract class Smoothie {
 
	String description = "Unknown Smoothie";
        Mango mango;
        Banana banana;
        Orange orange;
        Strawberry strawberry;
	 
	public abstract String getDescription();
	 
	public abstract double cost();
        
        protected void prepare(){};
}
 
