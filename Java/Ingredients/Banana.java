package Ingredients;

import Smoothies.*;
import Decorator.*;

public abstract class Banana extends Beverage{

    public abstract double cost();
    
    public abstract String getDescription();
}