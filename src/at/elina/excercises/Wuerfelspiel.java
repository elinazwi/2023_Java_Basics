package at.elina.excercises;

import java.util.Scanner;
import java.util.Random;

public class Wuerfelspiel {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Wuerfelspiel:)");
        boolean isPlaying = true;

        while (isPlaying) {
            int selection = getSelection();
            System.out.println("Selection:" + selection);

            if (selection == 1) {
                int sumPlayer = getSumOfRolledNumbers(6);
                int sumComputer = getSumOfRolledNumbers(6);

                System.out.println("Gewürfelte Zahl des Spielers " + sumPlayer);
                System.out.println("Gewürfelte Zahl des Computers " + sumComputer);

                if (sumPlayer > sumComputer) {
                    System.out.println("Du gewinnst:)");
                } else if (sumPlayer < sumComputer) {
                    System.out.println("Der Computer gewinnt:(");
                } else {
                    System.out.println("Geichstand!");
                }

            }
            if (selection == 2) {
                isPlaying = false;
                System.out.println("Sie haben das Spiel beendet");
            }
        }
    }

    private static int getSumOfRolledNumbers(int amountOfRolls) {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i <= amountOfRolls; i++) {
            int rolledNumber = random.nextInt(1, 7);
            sum += rolledNumber;
        }
        return sum;
    }

    private static int getSelection() {
        System.out.println("1. start Game");
        System.out.println("2. Spiel beenden");
        int selection = scanner.nextInt();
        return selection;
    }
}
