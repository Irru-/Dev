package Ingredients;


import Ingredients.Orange;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class FreshOrange extends Orange{
    
    public double cost(){
        return 1.50;
    }
    
    public String getDescription(){
        return "Fresh Orange";
    }
    
}