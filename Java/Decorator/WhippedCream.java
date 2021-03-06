package Decorator;


import Smoothies.Smoothie;

public class WhippedCream extends Decorator {
 
	private Smoothie smoothie;
        
        public WhippedCream(Smoothie smoothie){
                this.smoothie = smoothie;
        }
	 
	public double cost() {
		return .40 + smoothie.cost();
	}
	 
	public String getDescription() {
		return smoothie.getDescription() + ", Whipped Cream";
	}
	 
}
 
