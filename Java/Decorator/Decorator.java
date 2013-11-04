package Decorator;

import Smoothies.Smoothie;

public abstract class Decorator extends Beverage{
    
    protected final Smoothie smoothie;    
	
    public Decorator (Smoothie s){
        this.smoothie = s;
    }    
    
    public abstract String getDescription();
}
 
