package com.learningJava;
import java.util.Random;
import java.util.Scanner;

/*
Create a class Game, which allows a user to play "Guess the Number" game once.
        Game should have the following methods:
        1. Constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for noOfGuesses
        Use properties such as noOfGuesses(int), etc. to get this task done!
*/


class game {
    int generatedNum,input,num;
    Random rnd = new Random();
    Scanner sc = new Scanner(System.in);
    public game() {
        generatedNum = rnd.nextInt(100);
    }
    public void takeUserInput() {
        System.out.println("Enter the number you guess: ");
        input = sc.nextInt();
    }
    public boolean isCorrectNum() {
        num++;
        if (input == generatedNum) {
            System.out.println("Congratulations!!! \nYou guessed it right!\nIn "+num+" attempts");
            return true;
        } else if (input > generatedNum) {
            System.out.println("You guessed high.. Try Again");
        } else {
            System.out.println("You guessed low.. Try Again");
        }
        return false;
    }
}
public class ExerciseOnOOP {
    public static void main(String[] args) {
        game guess = new game();
        boolean b = false;
        while (!b){
            guess.takeUserInput();
            b = guess.isCorrectNum();
        }
    }
}

