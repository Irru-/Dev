package Decorator;

public class WhippedCream extends Decorator {

    //private Beverage smoothie;
    public WhippedCream(Beverage smoothie) {
        super(smoothie);
    }

    public double cost() {
        return .40 + super.cost();
    }

    public String getDescription() {
        return super.getDescription() + ", Whipped Cream";
    }
}
