/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class Order {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Smoothie drink = new Mango();
        getDescAndPrice(drink);
        
        Smoothie drink2 = new Banana();
        drink2 = new Milk(drink2);
        drink2 = new WhippedCream(drink2);
        drink2 = new WhippedCream(drink2);
        getDescAndPrice(drink2);        
        
        Smoothie drink3 = new Banana();
        drink3 = new IceCubes(drink3);
        drink3 = new WhippedCream(drink3);
        drink3 = new Icecream(drink3);
        getDescAndPrice(drink3);
    }
    
    public static void getDescAndPrice(Smoothie s){
        String result = s.getDescription();
        result = result + " $" + s.cost();
        System.out.println(result);
    }
}
