package at.elina.excercises;

import java.util.Scanner;

public class Bankomat {
    double balance = 0.0; // Anfangskontostand
    boolean isRunning = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wähle den gewünschten Behfehl aus: ");
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand anzeigen");
        System.out.println("4. Beenden");2

        int selectionOfUser = scanner.nextInt();
        System.out.println(selectionOfUser);


        switch (selectionOfUser){
            case 1:
                System.out.println("Welchen Betrag möchten sie einzahlen?");
                break;
            case 2:
                System.out.println("Welchen Betrag möchten sie abheben?");
                break;
            case 3:
                System.out.println("Kontostand");
                break;
            case 4:
                System.out.println("Beenden");
                break;

        }

    }
}
