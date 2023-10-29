package com.learningJava;

import java.util.Scanner;

public class PracticeSet06_ExceptionHandling {
    static class MaxRetriesException extends Exception{
        @Override
        public String toString() {
            return super.toString();
        }
    }
    public static void main(String[] args) throws MaxRetriesException {
//        Write a program that allows you to keep accessing an array until a valid index is  given, If max retries exceed 5 print "Error!".
        Scanner sc = new Scanner(System.in);
        int[] marks = {15,58,63,78,95};
        int i = 0;
        while (true){
            System.out.println("Try "+ (i+1));
            System.out.println("Enter the index: ");
            int idx = sc.nextInt();
            try {
                System.out.println(marks[idx]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid Index !");
                i++;
            }
            if (i>4){
                throw new MaxRetriesException();
            }
        }
    }
}
