package Decorator;


import Smoothies.Smoothie;

public class Icecream extends Decorator {
 
	private Smoothie smoothie;
        
        public Icecream(Smoothie smoothie){
            this.smoothie = smoothie;
        }
	 
	public double cost() {
		return .20 + smoothie.cost();
	}
	 
	public String getDescription() {
		return smoothie.getDescription() + ", Icecream";
	}
	 
}
 
