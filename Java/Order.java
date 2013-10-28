
import java.text.DecimalFormat;
import java.util.Scanner;

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
        
        int keuze = 0;
        int ing = -1;
        int ext = -1;
        
        do{
            SmoothieBar bar = null;
            Smoothie smoothie = null;
            System.out.println("Welkom - Kies of U in de winkel of "
                    + "in de car wilt bestellen");
            System.out.println("1 - Winkel");
            System.out.println("2 - Car");
            System.out.println("0 - Exit");
            System.out.println();

            keuze = s.nextInt();
            System.out.println();

            if(keuze == 1)
                bar = new StoreSmoothieBar();
            if(keuze == 2)
                bar = new CarSmoothieBar();
            if(keuze == 0)
                break;

                do{

                    System.out.println("Kies wat voor smoothie u wilt bestellen");
                    System.out.println("1 - Banaan");
                    System.out.println("2 - Mango");
                    System.out.println("3 - Sinaasappel");
                    System.out.println("4 - Aardbei");
                    System.out.println("0 - Exit");
                    System.out.println();

                    ing = s.nextInt();
                    System.out.println();
                    
                    switch (ing) {
                        case 1: smoothie = bar.orderSmoothie("Banana");                                
                                smoothie = extraAdd(smoothie);                                
                                break;
                        case 2: smoothie = bar.orderSmoothie("Mango");
                                smoothie = extraAdd(smoothie);
                                break;
                        case 3: smoothie = bar.orderSmoothie("Orange");
                                smoothie = extraAdd(smoothie);
                                break;
                        case 4: smoothie = bar.orderSmoothie("Strawberry");
                                smoothie = extraAdd(smoothie);
                                break;
                    }
                    
                    getDescAndPrice(smoothie);
                    System.out.println();

                } while (ing != 0); 
        
        } while (keuze != 3);
        
        System.out.println("Tot ziens");
        
    }
    
    public static void getDescAndPrice(Smoothie s){
        String result = s.getDescription();        
        DecimalFormat df = new DecimalFormat("###.00");
        String price = df.format(s.cost());
        result = result + ": $" + price;
        System.out.println(result);
    }
    
    public static void extraSelect()
    {
        
    }
    
    public static Smoothie extraAdd(Smoothie s)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kies welke extra's u in uw smoothie wilt.");
        System.out.println("1 - IJsklontjes");
        System.out.println("2 - Roomijs");
        System.out.println("3 - Melk");
        System.out.println("4 - Slagroom");
        System.out.println("0 - Exit");
        System.out.println();
        
        int k = -1;
        System.out.println();
        
        do{
            k = sc.nextInt();
            System.out.println();
            switch (k){
                case 1: s = new IceCubes(s);
                        break;
                case 2: s = new Icecream(s);
                        break;
                case 3: s = new Milk(s);
                        break;
                case 4: s = new WhippedCream(s);
                        break;
            }
        }while (k != 0);
        
        return s;
    }
}
