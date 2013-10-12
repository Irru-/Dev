/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class SmoothieFactory {
    public Smoothie createSmoothie(String s)
    {
        Smoothie smoothie = null;
        
        if(s.equals("Banana"))
            smoothie = new Banana();
        if(s.equals("Strawberry"))
            smoothie = new Strawberry();
        if(s.equals("Mango"))
            smoothie = new Mango();
        if(s.equals("Orange"))
            smoothie = new Orange();
        
        return smoothie;
    }
}
