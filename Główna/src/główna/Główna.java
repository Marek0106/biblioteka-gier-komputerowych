
package główna;

import javax.swing.JOptionPane;
import sun.invoke.util.Wrapper;

public class Główna {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int numer;
    
        
        
        String tmp1 = JOptionPane.showInputDialog(
                "Wybierz numer z listy czynności którą chcesz wykonać\n"
                + "        1.zapiszDoPliku\n"
                + "        2.wczytajZPliku\n"
                + "        3.dodaj\n"
                + "        4.wyświetlListe\n"
                + "        5.Usuń\n"
                + "        6.WyświetlTytuł\n"
                + "        7.WyświetlGryProducenta\n"
                + "        8.WyświetlGryWydawcy\n"
                + "        9.WyszukajGrę\n"
                + "      ");
           numer = Integer.parseInt(tmp1);



    while (numer > 10 || numer < 0){

        tmp1 = JOptionPane.showInputDialog("Ten numer nie mieści się w zakresie wyboru \n"
                                                  + "wybierz inny numer.");

        numer = Integer.parseInt(tmp1);

      if(numer==1){
          return
           ;
      }
    }
    }
}
          

           