package at.elina.excercises;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        double balance = 0; // Anfangskontostand
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Wählen sie den gewünschten Behfehl aus: ");
            selection();

            Scanner scanner = new Scanner(System.in);
            int selectionOfUser = scanner.nextInt();
            scanner.nextLine();

            switch (selectionOfUser) {
                case 1:
                    System.out.println("Welchen Betrag möchten sie einzahlen?");
                    double einzahlen = scanner.nextDouble();
                    balance += einzahlen;
                    System.out.println("Sie haben " + einzahlen + " Euro eingezahlt.");
                    break;

                case 2:
                    System.out.println("Welchen Betrag möchten sie abheben?");
                    double abheben = scanner.nextDouble();
                    balance -= abheben;
                    System.out.println("Sie haben " + abheben + " von ihrem Konto abgehoben.");
                    break;

                case 3:
                    System.out.println("Ihr Kontostand beträgt: " + balance + " Euro");
                    break;

                case 4:
                    System.out.println("Der Bankomat wurde beendet");
                    isRunning = false;
                    break;
            }
        }

    }

    private static void selection() {
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Ende");
    }
}
