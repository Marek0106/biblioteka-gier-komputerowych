/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package główna;

/**
 *
 * @author student
 */
public class Data {
    private short dzień;
    private short miesiąc;
    private short rok;
    
    public Data (short d, short m, short r) {
        dzień = d;
        miesiąc = m;
        rok = r;
    }
    
    @Override
    public String toString () {
        return Integer.toString (dzień) + '.' + Integer.toString (miesiąc) + ' ' + Integer.toString (rok);
    }
}
