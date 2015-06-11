package główna;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Główna {

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        int numer;

        BibliotekaGier b = new BibliotekaGier(10);

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

        while (numer > 9 || numer < 1) {

            tmp1 = JOptionPane.showInputDialog("Ten numer nie mieści się w zakresie wyboru \n"
                    + "wybierz inny numer.");

            numer = Integer.parseInt(tmp1);

            if (numer == 1) {
                b.zapiszDoPliku("lista");
            }

            if (numer == 2) {
                b.wczytajZPliku("lista");
            }

            if (numer == 3) {
                b.dodaj(null);
            }

            if (numer == 4) {
                b.wyświetlListe();
            }

     // if(numer==5){
            //  b.Usuń();}
            if (numer == 6) {
                b.WyświetlTytuł();
            }
            if (numer == 7) {
                b.WyświetlGryProducenta();
            }
            if (numer == 8) {
                b.WyświetlGryWydawcy();
            }
            if (numer == 9) {
                b.WyszukajGrę();
            }

        }
    }
}