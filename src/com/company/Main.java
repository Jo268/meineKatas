package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
       // Gibt die summe aller geraden Fibonacci zahlen bis counter aus.
        int counter = 15;
        double[] rekFib = new double[counter];
        for (int i = 1; i < counter; i++) {
            rekFib[i] = new Fibonacci().berechneFibonacciRekursiv(i);
        }
        System.out.println(new Fibonacci().summeDerGradenFibs(rekFib));

        System.out.println(new Fibonacci().summeDerGradenFibs(new Fibonacci().berechneFibonacciZahlen(counter-2)));
        System.out.println(" ");
        // ROT18 Kodierung
        new Main().verschluessele("ZW336!?");
        // erzeuge rekursiven Tannenbaum
        new Tannenbaum().rekursiverTannenBaum(10, 1);
        System.out.println(" ");
        // erzeuge Tannenbaum
        new Tannenbaum().erzeugeTannenbaum(7, true);

        double ergebnis = new BauernMultiplikation().multipliziereWieRussischeBauern(400, 510);
        System.out.println(" ");
        System.out.println(ergebnis);
    }

    // ROT13 Methode
    public void verschluessele(String string) {
        String meinAlphabet = "0123456789abcdefghijklmnopqrstuvwxyz".toUpperCase(Locale.ROOT);
        char[] eingabe = string.toCharArray();
        char[] ausgabe = new char[eingabe.length];
        int zeiger = 0;
        // Verschlüsselung
        for (int i = 0; i < eingabe.length; i++) {
            char value = Character.toUpperCase(eingabe[i]);
            zeiger = meinAlphabet.indexOf(value);
            if (zeiger == -1) {
                ausgabe[i] = eingabe[i];
            } else {
                zeiger += 18;
                if (zeiger >= meinAlphabet.length()) {
                    zeiger = zeiger % 36;
                }
                ausgabe[i] = meinAlphabet.charAt(zeiger);
            }
        }
        System.out.println(ausgabe);
    }
}

