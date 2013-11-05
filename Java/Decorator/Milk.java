package Decorator;

public class Milk extends Decorator {

    public Milk(Beverage smoothie) {
        super(smoothie);
    }

    public double cost() {
        return .30 + super.cost();
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
