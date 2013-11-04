package Decorator;


import Smoothies.Smoothie;

public class WhippedCream extends Decorator {
 
	//private Beverage smoothie;
        
        public WhippedCream(Smoothie smoothie){
                super(smoothie);
        }
	 
	public double cost() {
		return .40 + smoothie.cost();
	}
	 
	public String getDescription() {
		return smoothie.getDescription() + ", Whipped Cream";
	}
	 
}
 
