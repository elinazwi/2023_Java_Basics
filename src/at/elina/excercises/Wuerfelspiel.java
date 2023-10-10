package at.elina.excercises;

import java.util.Scanner;
import java.util.Random;

public class Wuerfelspiel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wuerfelspiel:)");
        boolean isPlaying = true;

        while (isPlaying) {
            selection();

        }
    }


    private static int rolledNumber() {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i <= 6; i++) {
            int rolledNumber = random.nextInt(1, 7);
            sum += rolledNumber;
        }
    }

    private static void selection() {
        System.out.println("1. start Game");
        System.out.println("2. Spiel beenden");
    }
}
