package Ingredients;


import Ingredients.Mango;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class FreshMango extends Mango{
    
    public double cost(){
        return 1.50;
    }
    
    public String getDescription(){
        return "Fresh Mango";
    }
    
}