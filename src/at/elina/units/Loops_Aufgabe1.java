package at.elina.units;

public class Loops_Aufgabe1 {

    public static void main(String[] args) {

    //Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen

        int summe = 0;

           for (int zahl = 1; zahl <= 100; zahl++) {
              summe += zahl;
                }

           System.out.println("Die Summe der Zahlen von 1 bis 100 inklusive beträgt: " + summe);

   }
}


