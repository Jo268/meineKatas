package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        new Tannenbaum().rekursiverTannenBaum(100, 1);
        System.out.println(" ");

        new Tannenbaum().erzeugeTannenbaum(7, true);

        double ergebnis = new BauernMultiplikation().multipliziereWieRussischeBauern(400, 510);
        System.out.println(" ");
        System.out.println(ergebnis);
        System.out.println(" ");
        new Main().verschluessele("Moin moin, macht der Friese");

    }

    // ROT13 Methode
    public void verschluessele(String string) {

        String meinAlphabet = "?!., 0123456789abcdefghijklmnopqrstuvwxyz";
        String rmtAlphabet = "?!., nopqrstuvwxyz0123456789abcdefghijklm";
        char[] charNormalAlphabet = meinAlphabet.toUpperCase(Locale.ROOT).toCharArray();
        char[] charRMTAlphabet = rmtAlphabet.toUpperCase(Locale.ROOT).toCharArray();
        char[] eingabe = string.toUpperCase(Locale.ROOT).toCharArray();
        char[] ausgabe = new char[eingabe.length];
        int zeiger = 0;
        // Verschlüsselung
        for (int i = 0; i < eingabe.length; i++) {
            char value = eingabe[i];
            for (int j = 0; j < charNormalAlphabet.length; j++) {
                if (value == charNormalAlphabet[j]) {
                    zeiger = j;
                }
            }
            ausgabe[i] = charRMTAlphabet[zeiger];
        }
        System.out.println(ausgabe);
    }

}

