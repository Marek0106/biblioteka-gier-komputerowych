/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package główna;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class BibliotekaGier {

    private Gra[] lista;
    private int liczbaGier;

    public BibliotekaGier(int maxLiczbaGier) {
        lista = new Gra[maxLiczbaGier];
        liczbaGier = 0;
    }//public ListaKsiazek

    public void zapiszDoPliku(String nazwaPliku) throws IOException {
        try (PrintWriter wynik = new PrintWriter(new FileWriter(nazwaPliku))) {
            wynik.println(liczbaGier);
            for (int i = 0; i < liczbaGier; i++) {
                wynik.println(lista[i].getTytuł());
                wynik.println(lista[i].getRodzajGry());
                wynik.println(lista[i].getWydawca());
                wynik.println(lista[i].getProducent());
                wynik.println(lista[i].getWymagania());
                wynik.println(lista[i].getWersjeJęzykowe());
                wynik.println(lista[i].getData());
                wynik.println(lista[i].getOpis());
            }//for
        }
    }//public void zapiszDoPliku

    public void wczytajZPliku(String nazwaPliku) throws FileNotFoundException, IOException {
        String tytuł;
        String rodzaj;
        String producent;
        String wydawca;
        String data;
        String wersjeJęzykowe;
        String opis;
        String wymagania;
        BufferedReader zrodlo = new BufferedReader(new FileReader(nazwaPliku));
        liczbaGier = Integer.parseInt(zrodlo.readLine());
        for (int i = 0; i < liczbaGier; i++) {
            tytuł = zrodlo.readLine();
            rodzaj = zrodlo.readLine();
            producent = zrodlo.readLine();
            wydawca = zrodlo.readLine();
            data = zrodlo.readLine();
            wersjeJęzykowe = zrodlo.readLine();
            opis = zrodlo.readLine();
            wymagania = zrodlo.readLine();
            lista[i] = new Gra(tytuł, rodzaj, producent, wydawca, data, wersjeJęzykowe, opis, wymagania);
        }//for
        zrodlo.close();
    }//public void wczytajZPliku

    public void dodaj(Gra nowaGra) {

        if (liczbaGier < lista.length) {
            nowaGra = new Gra();
            String tmp;
            tmp = JOptionPane.showInputDialog("podaj tytuł gry");
            nowaGra.setTytuł(tmp);
            tmp = JOptionPane.showInputDialog("podaj tytuł rodzaj gry");
            nowaGra.setRodzaj(tmp);
            tmp = JOptionPane.showInputDialog("podaj producenta gry");
            nowaGra.setProducent(tmp);
            tmp = JOptionPane.showInputDialog("podaj wydawce gry");
            nowaGra.setWydawca(tmp);
            tmp = JOptionPane.showInputDialog("podaj datę wydania gry");
            nowaGra.setData(tmp);
            tmp = JOptionPane.showInputDialog("podaj wersje językowe gry");
            nowaGra.setWersjeJęzykowe(tmp);
            tmp = JOptionPane.showInputDialog("podaj opis gry");
            nowaGra.setOpis(tmp);
            tmp = JOptionPane.showInputDialog("podaj wymagania systemowe gry");
            nowaGra.setWymagania(tmp);

            lista[liczbaGier] = nowaGra;
            liczbaGier++;

        }//if
        else {
            System.out.println("Nie można dodać gry ponieważ lista jest pełna");
        }
    }

    public void wyświetlListe() {
        for (int i = 0; i < liczbaGier; i++) {
            System.out.println((i + 1) + ") " + lista[i]);
        }//for
    }
    /*
    Metoda do usuwania gry z listy
    */
    public static void Usuń() {

    }
    /*
    Metoda do wyświetlania tytułu gry
    */
    public static void WyświetlTytuł() {

    }
    /*
    Metoda do wyświetlania producenta gry
    */
    public static void WyświetlGryProducenta() {

    }
    /*
    Metoda do wyśietlania wydawcy gry
    */
    public static void WyświetlGryWydawcy() {

    }
    /*
    Medota do wyszukania gry z listy
    */
    public static void WyszukajGrę() {

    }

    //wybieranie z listy WyświetlMenu() if (wybór==1)
}
