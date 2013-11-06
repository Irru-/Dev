/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Storage;

/**
 *
 * @author Nick
 */
public class StrawberryWarehouse implements Observer{
    
    private int i;
    private Subject stock;
    
    public StrawberryWarehouse(Subject stock){
        this.stock = stock;
        stock.registerObserver(this);
    }
    
    public void update(int b, int m, int o, int s) {
        Stock st = (Stock) stock;
        
        if(s == 0)
            st.addFruit(0,0,0,5);
        if(s > 0 && s < 3)
            st.addFruit(0,0,0,3);
        
    }
    
}
