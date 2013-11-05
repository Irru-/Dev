package Order;

import Decorator.*;
import Factories.*;
import Smoothies.Smoothie;
import java.text.DecimalFormat;
import java.util.Scanner;
import Juice.*;

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




        Scanner s = new Scanner(System.in);

        int keuze;
        int ing;
        double total = 0;

        do {
            BeverageBar bar = null;
            Beverage drink = null;
            System.out.println("Welkom - Kies of U in de winkel of "
                    + "in de car wilt bestellen");
            System.out.println("1 - Winkel");
            System.out.println("2 - Car");
            System.out.println("0 - Exit");
            System.out.println();

            keuze = s.nextInt();
            System.out.println();

            if (keuze == 1) {
                bar = new StoreBeverageBar();
            }
            if (keuze == 2) {
                bar = new CarBeverageBar();
            }
            if (keuze == 0) {
                break;
            }
            
            System.out.println("Welkom - Kies of U een smoothie of"
                    + " een drankje wil bestellen.");
            System.out.println("1 - Smoothie");
            System.out.println("2 - Juice");
            System.out.println("0 - Exit");
            System.out.println();

            int type = s.nextInt();
            System.out.println();

            if (type == 1) {
                drink = new Smoothie();
            }
            if (type == 2) {
                drink = new Juice();
            }

            do {
                if(drink instanceof Decorator && type == 1)
                    drink = new Smoothie();
                if(drink instanceof Decorator && type == 2)
                    drink = new Juice();
                System.out.println("Kies wat voor drink u wilt bestellen");
                System.out.println("1 - Banaan");
                System.out.println("2 - Mango");
                System.out.println("3 - Sinaasappel");
                System.out.println("4 - Aardbei");
                System.out.println("9 - Volgend Menu");
                System.out.println();

                ing = s.nextInt();
                System.out.println();

                switch (ing) {
                    case 1:
                        drink = bar.orderSmoothie("Banana", drink);
                        break;
                    case 2:
                        drink = bar.orderSmoothie("Mango", drink);
                        break;
                    case 3:
                        drink = bar.orderSmoothie("Orange", drink);
                        break;
                    case 4:
                        drink = bar.orderSmoothie("Strawberry", drink);
                        break;
                    case 9:
                        drink = extraAdd(drink);
                }

                if (ing != 0) {
                    getDescAndPrice(drink);
                    //total = total + drink.cost();
                    //System.out.println("De totaalprijs is " + total);
                    System.out.println();
                }

            } while (ing != 0);

        } while (keuze != 3);

        System.out.println("Tot ziens");

    }

    public static void getDescAndPrice(Beverage s) {
        System.out.println(s);
        String result = s.getDescription();
        DecimalFormat df = new DecimalFormat("###.00");
        String price = df.format(s.cost());
        result = result + ": $" + price;
        System.out.println(result);
    }

    public static Beverage extraAdd(Beverage s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kies welke extra's u in uw drink wilt.");
        System.out.println("1 - IJsklontjes");
        System.out.println("2 - Roomijs");
        System.out.println("3 - Melk");
        System.out.println("4 - Slagroom");
        System.out.println("0 - Exit");
        System.out.println();

        int k;
        System.out.println();
        do {
            k = sc.nextInt();
            System.out.println();
            switch (k) {
                case 1:
                    s = new IceCubes(s);
                    break;
                case 2:
                    s = new Icecream(s);
                    break;
                case 3:
                    s = new Milk(s);
                    break;
                case 4:
                    s = new WhippedCream(s);
                    break;
            }
        } while (k != 0);

        return s;
    }
}