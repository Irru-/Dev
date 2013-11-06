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
public class BananaWarehouse implements Observer{

    private int i;
    private Subject stock;
    
    public BananaWarehouse(Subject stock){
        this.stock = stock;
        stock.registerObserver(this);
    }
    
    public void update(int b, int m, int o, int s) {
        Stock st = (Stock) stock;
        
        if(b == 0)
            st.addFruit(5,0,0,0);
        if(b > 0 && b < 3)
            st.addFruit(3,0,0,0);
    }
    
}
