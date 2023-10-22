package com.learningJava;

import java.util.Scanner;

public class lj_SpecificExceptionHandling {
    public static void main(String[] args) {
        int[] marks = {10,20,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index: ");
        int ind = sc.nextInt();
        System.out.println("Enter the number from which the mark is to be divided: ");
        int num = sc.nextInt();

        try {
            System.out.println("Marks at index "+ind+" is "+marks[ind]);
            System.out.println("The final mark after division is "+ marks[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("The number can't be divided from 0.");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Check the index you entered!!!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Unknown Error");
            System.out.println(e);
        }
    }
}