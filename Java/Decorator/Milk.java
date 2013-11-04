package Decorator;

import Smoothies.Smoothie;

public class Milk extends Decorator {
 
	private Smoothie smoothie;
        
        public Milk(Smoothie smoothie){
            this.smoothie = smoothie;
        }
	 
	public double cost() {
		return .30 + smoothie.cost();
	}
	 
	public String getDescription() {
		return smoothie.getDescription() + ", Milk";
	}
	 
}
 
