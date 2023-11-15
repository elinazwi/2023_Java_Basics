package at.elina.excercises;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman{
    public static void main(String[] args) {
        String[] guessWords = {"elina", "dorotea", "hangman", "test"};
        Hangman game = new Hangman(guessWords);
        game.playGame();
    }

    public String[] words;
    public String wordToGuess;
    public String hiddenWord;
    public Scanner scanner;

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
            System.out.println("Gib einen Buchstaben ein:");
            char input = scanner.next().charAt(0);
            uncoverLetter(input);
            if ((hiddenWord) == (wordToGuess)) {
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
            }
        }
        hiddenWord = new String(chars);
    }
}