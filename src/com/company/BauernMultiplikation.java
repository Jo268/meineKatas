package com.company;

import static java.lang.Math.floor;

/**
 *Schreibe eine Funktion, die zwei ganze Zahlen mit dem Algorithmus „russische Bauernmultiplikation“ multipliziert.
 * Die Signatur der Methode sieht wie folgt aus:
 * int Mul(int x, int y);
 * Der Algorithmus der sogenannten Russischen Bauernmultiplikation verläuft wie folgt:
 * man halbiert die linke der beiden Zahlen so lange, bis die 1 erreicht ist.
 * Nachkommastellen werden abgerundet. Die rechte Zahl wird jeweils daneben geschrieben und verdoppelt.
 * Von den rechten Zahlen werden alle gestrichen, neben denen links eine gerade Zahl steht.
 * Die verbleibenden nicht gestrichenen Zahlen der rechten Seite werden dann addiert und bilden das Ergebnis der Multiplikation.
 */
public class BauernMultiplikation {
    public double multipliziereWieRussischeBauern(double zahl1, double zahl2) {
        double[] doppelteVonZahl2 = new double[10];
        int counter = 0;
        int ergebnis = 0;

        while (zahl1 > 1) {
            if (zahl1 % 2 == 0) {
                doppelteVonZahl2[counter] = 0;
            } else {
                doppelteVonZahl2[counter] = zahl2;
            }
            zahl1 = floor(zahl1 / 2);
            zahl2 = zahl2 * 2;
            counter += 1;
        }
        doppelteVonZahl2[counter] = zahl2;
        for (double v : doppelteVonZahl2) {
            ergebnis += v;
        }
        return ergebnis;
    }
}

