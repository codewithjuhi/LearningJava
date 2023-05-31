package com.learningJava;

public class lj_break_and_continue {
    public static void main(String[] args) {
//        Break and continue using loops.
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2) {
                System.out.println("Ending loop..");
                break;
            }
        }
                                                  /* Can be used in all types of loops. */
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Restarting loop..");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }
}