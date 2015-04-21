
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
    /**
     * Tytuł gry
     */
    private String tytuł;
    /**
     * Rodzaj gry wybrany z listy enmu RodzajGry
     */
    private rodzajGry [] rodzaj;
    /**
     * Producent Gry
     */
    private String producent;
    /**
     * Wydawca Gry
     */
    private String wydawca;
    /**
     * Data wydania gry
     */
    private Data dataWydania;
    /**
     * dostępne wersje jężykowe gry
     */
    private String [] wersjeJęzykowe;
    /**
     * krótki opis gry
     */
    private String opis;
    /**
     * Wymagania systemowe potrzebne do uruchomienia gry
     */
    private WymaganiaSystemowe wymagania;
}