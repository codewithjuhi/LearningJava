package com.learningJava;

import java.util.Scanner;

public class lj_NestedTryCatch {
    public static void main(String[] args) {
        int[] marks = {32, 78, 56};
        Scanner sc = new Scanner(System.in);
        boolean flag1 = true;
        while (flag1) {
            try {
                System.out.println("Enter the Index: ");
                int a = sc.nextInt();
                try {
                    System.out.println("Marks at index " + a + " is " + marks[a]);
                    flag1 = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Entered index is incorrect!");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
    }
}
