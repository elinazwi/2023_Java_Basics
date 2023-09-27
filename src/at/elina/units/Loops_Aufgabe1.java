package at.elina.units;

public class Loops_Aufgabe1 {

    public static void main(String[] args) {

    //Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen

        int summe = 0;

           for (int i = 1; i <= 100; i++) {
              summe += i;
                }

           System.out.println("Die Summe der Zahlen von 1 bis 100 inklusive beträgt: " + summe);

   }
}


