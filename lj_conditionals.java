package com.learningJava;
import java.util.Scanner;

public class lj_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int a = sc.nextInt();
        if (a>18){
            System.out.println("Eligible to drive");
        }
        else {
            System.out.println("Note Eligible to drive");
        }
    }
}
