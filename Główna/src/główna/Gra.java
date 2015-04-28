
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
    /**
     * pobierz tytuł
     * @return wyświetl tytuł
     */
    public String getTytuł() {
        return tytuł;
    }
    /**
     * ustaw tytuł
     * @param tytuł przypisuje tytuł do tego parametru
     */
    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }
    /**
     * pobierz rodzaj
     * @return wyświetl rodzaj
     */
    public rodzajGry[] getRodzaj() {
        return rodzaj;
    }
    /**
     * ustaw rodzaj 
     * @param rodzaj przypisuje rodzaj do tego parametru
     */
    public void setRodzaj(rodzajGry[] rodzaj) {
        this.rodzaj = rodzaj;
    }
    /**
     * pobierz Producenta 
     * @return wyświetl producenta 
     */
    public String getProducent() {
        return producent;
    }
    /**
     * ustaw producenta 
     * @param producent przypisuje producenta do tego parametru
     */
    public void setProducent(String producent) {
        this.producent = producent;
    }
    /**
     * pobierz wydawcę
     * @return wyświetl wydawcę
     */
    public String getWydawca() {
        return wydawca;
    }
    /**
     * ustaw wydawcę
     * @param wydawca przypisuje wydawcę do tego parametru
     */
    public void setWydawca(String wydawca) {
        this.wydawca = wydawca;
    }
    /**
     * pobierz date wydania
     * @return wyświetl datę wydania
     */
    public Data getDataWydania() {
        return dataWydania;
    }
    /**
     * ustaw datę wydania
     * @param dataWydania przypisuje datę wydania do tego parametru
     */
    public void setDataWydania(Data dataWydania) {
        this.dataWydania = dataWydania;
    }
    /**
     * pobierz wersję językowe
     * @return wyświetl wersje językowe
     */
    public String[] getWersjeJęzykowe() {
        return wersjeJęzykowe;
    }
    /**
     * ustaw wersje językowe
     * @param wersjeJęzykowe przypisuje wersje językowe do tego parametru
     */
    public void setWersjeJęzykowe(String[] wersjeJęzykowe) {
        this.wersjeJęzykowe = wersjeJęzykowe;
    }
    /**
     * pobierz opis
     * @return wyświetl opis
     */
    public String getOpis() {
        return opis;
    }
    /**
     * ustaw opis 
     * @param opis przypisuje opis do tego parametru
     */
    public void setOpis(String opis) {
        this.opis = opis;
    }
    /**
     * pobierz opis
     * @return wyświetl opis
     */
    public WymaganiaSystemowe getWymagania() {
        return wymagania;
    }
    /**
     * ustaw wymagania
     * @param wymagania przypisuje wymagania do tego parametru
     */
    public void setWymagania(WymaganiaSystemowe wymagania) {
        this.wymagania = wymagania;
    }
    /*
    Dodaje nowa Gre
    */
    public static void Dodaj(){
        
    }
    /*
    Usuwa wybraną gre z listy
    */
    public static void Usuń() {
        
    }
    /*
    Wyświetla wybrany Tytuł
    */
    public static void WyświetlTytuł() {
        
    }
    /*
    Wyświetla wszystkie gry producenta 
    */
    public static void WyświetlGryProducenta() {
        
    }
    /*
    Wyświetla wszystkie gry danego wydawcy
    */
    public static void WyświetlGryWydawcy () {
        
    }
    /*
    Wyszukuje Gre z listy
    */
    public static void WyszukajGrę() {
        
    }
}

