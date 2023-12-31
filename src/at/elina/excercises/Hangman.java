package at.elina.excercises;

import java.util.Objects;
import java.util.Scanner;

public class Hangman{
    public static void main(String[] args) {
        String[] guessWords = {"elina", "dorotea", "hangman", "test"};
        Hangman game = new Hangman(guessWords);

        game.playGame();
    }

    public String[] words;

    public String guessedLetters = "";
    public String wordToGuess;
    public String hiddenWord;
    public static Scanner scanner;


    public Hangman(String[] words) {
        this.words = words;
        scanner = new Scanner(System.in);
        selectRandomWord();
        hideWord();
    }

    public void selectRandomWord() {
        int index = (int) (Math.random() * words.length);
        wordToGuess = words[index];

    }

    public void printGuessedLetters(){
        System.out.println(guessedLetters);
    }

    public void hideWord() {
        char[] chars = wordToGuess.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = '*';
        }
        hiddenWord = new String(chars);
    }

    public void playGame() {
        while (true) {
            System.out.println(hiddenWord);
            printGuessedLetters();
            System.out.println("Gib einen Buchstaben ein:");
            char input = scanner.next().charAt(0);
            guessedLetters += Character.toString(input);
            uncoverLetter(input);
            if (Objects.equals(hiddenWord, wordToGuess)) {
                System.out.println("Herzlichen Glückwunsch! Du hast das Wort erraten!");
                break;
            }
        }
    }

    public void uncoverLetter(char letter) {
        char[] chars = hiddenWord.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '*' && wordToGuess.charAt(i) == letter) {
                chars[i] = letter;
                System.out.println("Du hast den Buchstaben: " + letter + " geraten");
            }
        }
        hiddenWord = new String(chars);
    }
}