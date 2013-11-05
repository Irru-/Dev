package Decorator;

public class Icecream extends Decorator {

    public Icecream(Beverage smoothie) {
        super(smoothie);
    }

    public double cost() {
        return .20 + super.cost();
    }

    public String getDescription() {
        return super.getDescription() + ", Icecream";
    }
}
