
import java.text.DecimalFormat;

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
        /*Smoothie drink = new Mango();
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
        getDescAndPrice(drink3);*/
        
        SmoothieBar store = new StoreSmoothieBar();
        SmoothieBar car = new CarSmoothieBar();
        
        Smoothie s = store.orderSmoothie("Banana");
        Smoothie s2 = car.orderSmoothie("Banana");
        
        getDescAndPrice(s);
        getDescAndPrice(s2);
        
        
    }
    
    public static void getDescAndPrice(Smoothie s){
        String result = s.getDescription();        
        DecimalFormat df = new DecimalFormat("###.00");
        String price = df.format(s.cost());
        result = result + ": $" + price;
        System.out.println(result);
    }
}
