package Smoothies;

import Ingredients.Banana;
import Ingredients.Mango;
import Ingredients.Orange;
import Ingredients.Strawberry;
import Decorator.*;

public class Smoothie extends Beverage{
 
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
        
        public void setFruit(Smoothie s)
        {
            if(s instanceof Banana)
            {
                banana = (Banana) s;
                if(!desc.matches(""))
                    desc = desc + ", " + banana.getDescription();
                if(desc.matches(""))
                    desc = banana.getDescription();
                cost = cost + banana.cost();
            }
            if(s instanceof Orange)
            {
                orange = (Orange) s;
                if(!desc.matches(""))
                    desc = desc + ", " + orange.getDescription();
                if(desc.matches(""))
                    desc = orange.getDescription();
                cost = cost + orange.cost();
            }
            if(s instanceof Strawberry)
            {
                strawberry = (Strawberry) s;
                if(!desc.matches(""))
                    desc = desc + ", " + strawberry.getDescription();
                if(desc.matches(""))
                    desc = strawberry.getDescription();
                cost = cost + strawberry.cost();
            }
            if(s instanceof Mango)
            {
                mango = (Mango) s;
                if(!desc.matches(""))
                    desc = desc + ", " + mango.getDescription();
                if(desc.matches(""))
                    desc = mango.getDescription();
                cost = cost + mango.cost();
            }
        }
}
 
