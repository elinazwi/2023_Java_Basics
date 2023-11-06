package at.elina.excercises;

import java.util.Random;
import java.util.Scanner;

public class Hangman {

 /*   public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        boolean isGameRunning = true;
        String[] words = {"Deutsch"};
        Scanner scanner = new Scanner(System.in);

        while (isGameRunning) {
            String randomWord = words[randomNumberGenerator.nextInt(words.length)];
            boolean isGuessing = true;
            String visibleLetters = getVisibleLetters;

            printWord(randomWord, visibleLetters);
            System.out.println();

            while (isGuessing) {
                System.out.print("Input: ");
                String input = scanner.nextLine();
                visibleLetters += input.toLowerCase();
                printWord(randomWord, visibleLetters);
                System.out.println();
                isGuessing = isGameRunning(randomWord, visibleLetters);

            }
        }

    }
    public static void printWord (String word) {
        String[] ListOfWords = word.split("");
        for (String character : ListOfWords) {
            if (visibleLetters.contains(character.toLowerCase())) {
                System.out.print(character);
            } else {
                System.out.print("*");

            }
        }
    }

} */

    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        boolean isGameRunning = true;
        String[] words = {"Mathe", "Deutsch", "Englisch", "Dorotea", "Sena"};
        Scanner scanner = new Scanner(System.in);

        while (isGameRunning) {
            String randomWord = words[randomNumberGenerator.nextInt(words.length)];
            boolean isGuessing = true;
            String trueLetters = getTrueLetters(randomWord, 0);

            printWord(randomWord, trueLetters);
            System.out.println();

            while (isGuessing) {
                System.out.print("Input: ");
                String input = scanner.nextLine();
                trueLetters += input.toLowerCase();
                printWord(randomWord, trueLetters);
                System.out.println();
                isGuessing = isGameRunning(randomWord, trueLetters);

            }
            System.out.println("Finished Game!");
            System.out.println("Wenn Sie weiter spielen wollen, schreiben sie: weiter. Ansonsten schreiben sie: stop");
            String input = scanner.nextLine();
            if (input.contains("stop")) {
                isGameRunning = false;
            }
        }
    }

    public static String getTrueLetters(String word, int amount) {
        Random randomNumberGenerator = new Random();
        String trueLetters = new String();
        String[] letterList = word.split("");
        for (int i = 0; i < amount; i++) {
            trueLetters += letterList[randomNumberGenerator.nextInt(letterList.length)].toLowerCase();
        }
        return trueLetters;

    }

    public static void printWord (String word, String trueLetters) {
        String[] word_list = word.split("");
        for (String character : word_list) {
            if (trueLetters.contains(character.toLowerCase())) {
                System.out.print(character);
            } else {
                System.out.print("*");

            }
        }
    }

    public static boolean isGameRunning(String word, String trueLetters) {
        boolean gameRunning = false;
        String[] word_list = word.split("");
        for (String character : word_list) {
            if (!trueLetters.contains(character.toLowerCase())) {
                gameRunning = true;
            }
        }

        return gameRunning;
    }
}