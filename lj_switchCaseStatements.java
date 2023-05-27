package com.learningJava;
import java.util.Scanner;

public class lj_switchCaseStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age- ");
        byte age = sc.nextByte();

        switch (age) {
            case 18 -> System.out.println("Turning ADULT!");
            case 23 -> System.out.println("Getting a JOB!");
            case 60 -> System.out.println("Getting RETIRED!");
            default -> System.out.println("ENJOY YOUR LIFE!");
        }
    }
}
