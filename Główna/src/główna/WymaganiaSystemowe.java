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
public class WymaganiaSystemowe {
    private String archProc; // architektura procka
    private short taktProc; // taktowanie procka, MHz
    private short RAM; // GB
    private short HDD; // GB
    private short taktProcGraf; // taktowanie procka graficznego
    private short VRAM; // GB
    private boolean internet; // czy wymagany dostęp do neta
    private boolean LAN; // czy wymagany LAN
    
    public WymaganiaSystemowe (String a, short t, short R, short H, short tg, short VR, boolean i, boolean l) {
        archProc = a;
        taktProc = t;
        RAM = R;
        HDD = H;
        taktProcGraf = tg;
        VRAM = VR;
        internet = i;
        LAN = l;
    }
    
    @Override
    public String toString () {
        String napis = "Wymagania systemowe:\n";
        napis += "Procesor " + archProc;
        int n = taktProc / 1000;
        napis += Integer.toString (n) + ',';
        n = taktProc - (taktProc / 1000) * 1000;
        napis += Integer.toString (n) + " GHz,\n";
        napis += Integer.toString (RAM) + " GB RAM,\n";
        napis += Integer.toString (HDD) + " GB miejsca na dysku,\n";
        n = taktProcGraf / 1000;
        napis += "karta graficzna: " + Integer.toString (n) + ',';
        n = taktProcGraf - (taktProcGraf / 1000) * 1000;
        napis += Integer.toString (n) + " GHz,\n";
        napis += Integer.toString (VRAM) + " GB Video RAM.\n";
        
        return napis;
    }
}
