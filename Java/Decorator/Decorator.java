package Decorator;

import Smoothies.Smoothie;

public abstract class Decorator extends Beverage{
    
    protected final Smoothie smoothie;    
	
    public Decorator (Smoothie smoothie){
        this.smoothie = smoothie;
    }
    
    public double cost(){
        return smoothie.cost();
    }
    
    public String getDescription(){
        return smoothie.getDescription();
    }
}
 
