package com.sample;

// Klasa składująca pozycje w zapytaniu do użytkownika- tekst pytania i odpowiedz

public class Opcja{
    public static String Pytanie;
    public static String Odpowiedz;
    public String pytanie;
    public String odpowiedz;
   
    
    public Opcja() {
        this.pytanie = Pytanie;
        this.odpowiedz = Odpowiedz;
    }

    public String getPytanie() {
        return this.pytanie;
    }

    public String getOdpowiedz() {
        return this.odpowiedz;
    }

    public static void setOdpowiedz(String odpowiedz) {
        Odpowiedz = odpowiedz;
    }
    
    public static void setPytanie(String pytanie) {
    	Pytanie = pytanie;
    }

}