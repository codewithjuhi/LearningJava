package com.learningJava;
import java.util.Scanner;

public class leapYearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check");
        int yr = sc.nextInt();
        if (yr%4==0){
            System.out.println(yr + " is a leap year. ");
        }
        else {
            System.out.println(yr + " is not a leap year.");
        }
    }
}
