/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Storage;

import java.util.ArrayList;

/**
 *
 * @author Nick
 */
public class Stock implements Subject{
    
    private ArrayList observers;
    public int banana = 0;
    public int mango = 0;
    public int strawberry = 0;
    public int orange = 0;
    
    public Stock(int i){
        
        observers = new ArrayList();
        addFruit(i,i,i,i);
    }
    
    public ArrayList returnList(){
        return observers;
    }
    
    public void useFruit(String s)
    {
        s = s.toLowerCase();
        if(s.equals("banana"))
            banana--;
        if(s.equals("mango"))
            mango--;
        if(s.equals("strawberry"))
            strawberry--;
        if(s.equals("orange"))
            orange--;
    }
    
    public int getFruit(String s)
    {
        s = s.toLowerCase();
        if(s.equals("banana"))
            return banana;
        if(s.equals("mango"))
            return mango;
        if(s.equals("strawberry"))
            return strawberry;
        else
            return orange;
    }
    
    public void addFruit(int b, int m, int o, int s)
    {
        banana += b;
        mango += m;
        strawberry += s;
        orange += o;
    }
    
    public void addBanana(int i){
        banana += i;
    }
    
    public void addMango(int i){
        mango += i;
    }

    public void addOrange(int i){
        orange += i;
    }
    
    public void addStrawberry(int i){
        strawberry += i;
    }
    
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0)
            observers.remove(i);
    }

    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i ++){
            Observer o = (Observer) observers.get(i);
            o.update(3);
        }
    }
    
    public void restock(){
        notifyObservers();
    }
}
