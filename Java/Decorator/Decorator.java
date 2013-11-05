package Decorator;

public abstract class Decorator extends Beverage{
    
    protected final Beverage smoothie;    
	
    public Decorator (Beverage smoothie){
        this.smoothie = smoothie;
    }
    
    public double cost(){
        return smoothie.cost();
    }
    
    public String getDescription(){
        return smoothie.getDescription();
    }
}
 
