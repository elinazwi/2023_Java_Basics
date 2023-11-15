package at.elina.excercises;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman{
    public static void main(String[] args) {
        String[] guessWords = {"elina", "dorotea", "Hangman", "test"};
        Hangman game = new Hangman(guessWords);
        game.playGame();
    }

    private String[] words;
    private String wordToGuess;
    private String hiddenWord;
    private Scanner scanner;

    public Hangman(String[] words) {
        this.words = words;
        scanner = new Scanner(System.in);
        selectRandomWord();
        hideWord();
    }

    private void selectRandomWord() {
        int index = (int) (Math.random() * words.length);
        wordToGuess = words[index];
    }

    private void hideWord() {
        char[] chars = wordToGuess.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = '*';
        }
        hiddenWord = new String(chars);
    }

    public void playGame() {
        while (true) {
            System.out.println(hiddenWord);
            System.out.println("Gib einen Buchstaben ein:");
            char input = scanner.next().charAt(0);
            uncoverLetter(input);
            if ((hiddenWord) == (wordToGuess)) {
                System.out.println("Herzlichen Glückwunsch! Du hast das Wort erraten!");
                break;
            }
        }
    }

    private void uncoverLetter(char letter) {
        char[] chars = hiddenWord.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '*' && wordToGuess.charAt(i) == letter) {
                chars[i] = letter;
            }
        }
        hiddenWord = new String(chars);
    }
}