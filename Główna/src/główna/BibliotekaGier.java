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
                wynik.println(lista[i].getDataWydania());
                wynik.println(lista[i].getOpis());
            }//for
        }
    }//public void zapiszDoPliku

    public void wczytajZPliku(String nazwaPliku) throws FileNotFoundException, IOException {
        String tytuł;
        String rodzaj;
        String producent;
        String wydawca;
        String dataWydania;
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
            dataWydania = zrodlo.readLine();
            wersjeJęzykowe = zrodlo.readLine();
            opis = zrodlo.readLine();
            wymagania = zrodlo.readLine();
            lista[i] = new Gra(tytuł, rodzaj, producent, wydawca, dataWydania, wersjeJęzykowe, opis, wymagania);
        }//for
        zrodlo.close();
    }//public void wczytajZPliku


public void dodaj(Gra nowa) {
        if (liczbaGier < lista.length) {
            lista[liczbaGier] = nowa;
            liczbaGier++;
            Gra[] lista = new Gra[liczbaGier];
            
        }//if
    }
    
         public void wyświetlListe() {
        for (int i=0; i<liczbaGier; i++) {
            System.out.println((i+1)+") "+lista[i]);
        }//for
         }

    public static void Usuń() {

    }

    public static void WyświetlTytuł() {

    }

    public static void WyświetlGryProducenta() {

    }

    public static void WyświetlGryWydawcy() {

    }

    public static void WyszukajGrę() {

    }

    //wybieranie z listy WyświetlMenu() if (wybór==1)
}
