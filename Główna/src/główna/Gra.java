
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
    /**
     * Konstruktor Gry
     * @param tytuł nadanie tutułu gry
     * @param rodzaj nadanie rodzaju gry
     * @param producent nazwa producenta gry
     * @param wydawca nazwa wydawcy gry
     * @param dataWydania data wydania tej gry
     * @param wersjeJęzykowe mozliwe wersje jezykowe gry
     * @param opis opis danej gry
     * @param wymagania wymagania systemowe aby gra sie uruchomiła
     */
    public Gra(String tytuł, rodzajGry[] rodzaj, String producent, String wydawca, Data dataWydania, String[] wersjeJęzykowe, String opis, WymaganiaSystemowe wymagania) {
        this.tytuł = tytuł;
        this.rodzaj = rodzaj;
        this.producent = producent;
        this.wydawca = wydawca;
        this.dataWydania = dataWydania;
        this.wersjeJęzykowe = wersjeJęzykowe;
        this.opis = opis;
        this.wymagania = wymagania;
    }

    public String getTytuł() {
        return tytuł;
    }

    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }

    public rodzajGry[] getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(rodzajGry[] rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getWydawca() {
        return wydawca;
    }

    public void setWydawca(String wydawca) {
        this.wydawca = wydawca;
    }

    public Data getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(Data dataWydania) {
        this.dataWydania = dataWydania;
    }

    public String[] getWersjeJęzykowe() {
        return wersjeJęzykowe;
    }

    public void setWersjeJęzykowe(String[] wersjeJęzykowe) {
        this.wersjeJęzykowe = wersjeJęzykowe;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public WymaganiaSystemowe getWymagania() {
        return wymagania;
    }

    public void setWymagania(WymaganiaSystemowe wymagania) {
        this.wymagania = wymagania;
    }
    
    public static void Dodaj(){
        
    }
    
    public static void Usuń() {
        
    }
    
    public static void WyświetlTytuł() {
        
    }
    
    public static void WyświetlGryProducenta() {
        
    }
    
    public static void WyświetlGryWydawcy () {
        
    }
    
    public static void WyszukajGrę() {
        
    }
}

