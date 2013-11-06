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
public class MangoWarehouse implements Observer{
    
    private Subject stock;
    
    public MangoWarehouse(Subject stock){
        this.stock = stock;
        stock.registerObserver(this);
    }
    
    public void update(int i) {
        Stock st = (Stock) stock;
        
        st.addMango(i);
    }
    
}
