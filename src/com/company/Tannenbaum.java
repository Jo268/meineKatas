package com.company;

public class Tannenbaum {
    /**
     * Schreibe eine Funktion, die einen Tannenbaum mit ASCII-Art „gezeichnet“ als Text zurückliefert.
     * Eingabe ist die Höhe des Tannenbaums.
     * Als Beispiel ein Tannenbaum der Höhe 5:
     * Tannenbaum.Zeichnen(5)
     *        X
     *       XXX
     *      XXXXX
     *     XXXXXXX
     *    XXXXXXXXX
     *        I
     * **/
    // 1.Versuch
    public void erzeugeTannenbaum(int height) {
         System.out.print("    ");
         for (int i = 0; i <= height - 9; i++) {
             System.out.print("X");
         }
         System.out.println(" ");
         System.out.print("   ");
         for (int i = 0; i <= height - 7; i++) {
             System.out.print("X");
         }
         System.out.println(" ");
         System.out.print("  ");
         for (int i = 0; i <= height - 5; i++) {
             System.out.print("X");
         }
         System.out.println(" ");
         System.out.print(" ");
         for (int i = 0; i <= height - 3; i++) {
             System.out.print("X");
         }
         System.out.println(" ");

         for (int i = height; i >= 0; i--) {
             if (i == 0) {
                 System.out.println(" ");

                 for (int j = 0; j < (height / 2); j++) {
                     System.out.print(" ");
                 }
                 System.out.println("I");
             } else {
                 System.out.print("X");
             }
         }
     }
    // 2.mit Methoden
    public void erzeugeTannenbaum(int height, boolean mitSpitze) {
        if (mitSpitze) {
            printSpace(height - 2);
            System.out.print("<^>");
        }
        int counter = height;
        for (int i = 0; i < height; i++) {
            printSpace(counter);
            printX(i);
            counter = counter - 1;
        }
        printSpace(height - 1);
        System.out.println("I");
    }
    // 3.rekursiv
    public void rekursiverTannenBaum(int height, int count) {
        if (count != height) {
            printSpace(height-count);
            printXrekursiv(count*2);
            System.out.println(" ");
            count++;
            rekursiverTannenBaum(height, count);
        }
        printSpace(height-1);
        System.out.println("#");
    }

    // helperMethods
    public void printXrekursiv(int amount) {
        for (int i = 1; i < amount; i++) {
            System.out.print("X");
        }
    }

    public void printX(int amount) {
        for (int i = 1; i < amount * 2; i++) {
            System.out.print("X");
        }
        System.out.println(" ");
    }

    public void printSpace(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }
    }

}