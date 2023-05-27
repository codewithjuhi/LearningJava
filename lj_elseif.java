package com.learningJava;
import java.util.Scanner;

public class lj_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextByte();

        if (age>50){
            System.out.println("LEGEND!");
        }
        else if (age>30) {
            System.out.println("PRO!");
        }
        else {
            System.out.println("NOOB!");
        }
    }
}
