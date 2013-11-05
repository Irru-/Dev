package Decorator;

public class IceCubes extends Decorator {
 
	private Beverage smoothie;
        
        public IceCubes(Beverage smoothie) {
                super(smoothie);
        }    
	 
	public double cost() {
		return .15 + super.cost();
	}
	 
	public String getDescription() {
		return super.getDescription() + ", Ice Cubes";
	}
        
        
	 
}
 
