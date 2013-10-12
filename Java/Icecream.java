public class Icecream extends Extras {
 
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
 
