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
    
    public void update(int i) {
        Stock st = (Stock) stock;
        st.addBanana(i);
    }
    
}
