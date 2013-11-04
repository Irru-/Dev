package Decorator;

import Smoothies.Smoothie;

public class IceCubes extends Decorator {
 
	private Smoothie smoothie;
        
        public IceCubes(Smoothie smoothie) {
                this.smoothie = smoothie;
        }
	 
	public double cost() {
		return .15 + smoothie.cost();
	}
	 
	public String getDescription() {
		return smoothie.getDescription() + ", Ice Cubes";
	}
        
        
	 
}
 
