package Decorator;


import Smoothies.Smoothie;

public class Icecream extends Decorator {
 
	//private Beverage smoothie;
        
        public Icecream(Smoothie smoothie){
            super(smoothie);
        }
	 
	public double cost() {
		return .20 + smoothie.cost();
	}
	 
	public String getDescription() {
		return smoothie.getDescription() + ", Icecream";
	}
	 
}
 
