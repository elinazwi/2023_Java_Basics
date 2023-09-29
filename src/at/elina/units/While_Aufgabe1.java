package at.elina.units;

import java.util.Random;

public class While_Aufgabe1 {

    // Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.
    // Das Programm soll die Zufallszahlen zusammenzählen. Sobald die Zahl 15 oder die Zahl 25 kommt,
    // wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!

    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;
        int summe = 0;

        while (!isFinished) {
            int randomNumber = random.nextInt(10, 31);
            System.out.println(randomNumber);


            if ((randomNumber == 15) || (randomNumber == 25)) {
                isFinished = true;
                break;
            }

            summe += randomNumber;

        }
        System.out.println("Summe der vorherigen Zufallszahlen: " + summe);
    }

}
