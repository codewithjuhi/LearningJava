package project1;

import java.util.Random;
import java.util.Scanner;

class Game {
    int generatedNum, input, num;
    Random rnd = new Random();
    Scanner sc = new Scanner(System.in);

    public Game() {
        generatedNum = rnd.nextInt(100);
    }

    public void takeUserInput() {
        System.out.println("Enter the number you guess: ");
        input = sc.nextInt();
    }

    public boolean isCorrectNum() {
        num++;
        if (input == generatedNum) {
            System.out.println("Congratulations!!! \nYou guessed it right!\nIn " + num + " attempts");
            return true;
        } else if (input > generatedNum) {
            System.out.println("You guessed high.. Try Again");
        } else {
            System.out.println("You guessed low.. Try Again");
        }
        return false;
    }
}

public class Aryan {
    public static void main(String[] args) {
        Game guess = new Game();
        boolean b = false;
        while (!b) {
            guess.takeUserInput();
            b = guess.isCorrectNum();
        }
    }
}
