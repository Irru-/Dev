package Decorator;

import Smoothies.Smoothie;

public class Milk extends Decorator {

    public Milk(Smoothie smoothie) {
        super(smoothie);
    }

    public double cost() {
        return .30 + smoothie.cost();
    }

    public String getDescription() {
        return smoothie.getDescription() + ", Milk";
    }

}
