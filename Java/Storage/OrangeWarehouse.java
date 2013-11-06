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
public class OrangeWarehouse implements Observer{
    
    private Subject stock;
    
    public OrangeWarehouse(Subject stock){
        this.stock = stock;
        stock.registerObserver(this);
    }
    
    public void update(int i) {
        Stock st = (Stock) stock;
        
        st.addOrange(i);
        
    }
    
}
