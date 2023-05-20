package com.learning;
import java.util.Scanner;


public class lj_TakingInput {
    public static void main(String[] args) {
        System.out.println("It Works");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int sum = a+b;

        System.out.println("The sum of numbers is: "+sum);

    }
}
