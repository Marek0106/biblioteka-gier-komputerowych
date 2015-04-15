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

enum rodzajGry {
    akcja,
    ekonomiczna,
    FPP,
    FPS,
    horror,
    logiczna,
    otwartyŚwiat,
    platformowa,
    przygodowa,
    RPG,
    RTS,
    sandbox,
    skradanka,
    strategia,
    strzelanka,
    survival,
    symulator,
    taktyczna,
    wyścigowa,
    zręcznościowa
}

public class Gra {
    private String tytuł;
    private rodzajGry [] rodzaj;
    private String producent;
    private String wydawca;
    private Data dataWydania;
    private String [] wersjeJęzykowe;
    private String opis;
    private WymaganiaSystemowe wymagania;
}