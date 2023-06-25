package com.learningJava;

import java.util.Scanner;

public class practiceSet02_Methods {

//    Problem 1 - Print multiplication table of a number n.
    public static void table(int n){
        int a;
        for (int i=1; i<=10; i++){
//            a = i*n;
            System.out.println(n +" * "+ i + " = "+ i*n);
        }
    }

//  Problem 2
    public static void pattern1(int x){
        for (int i=0; i<x; i++){
            for (int j=0; j<i+1; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

//    Problem 3 - Sum of first n natural numbers using recursion.
    public static int sumRec(int y){
        if (y==1){
            return 1;
        }
       return y + sumRec(y-1);

    }

//    Problem 4
    public static void pattern2(int x){
        for (int i=0; i<x; i++){
            for (int j=x-i; j>0; j--){
                System.out.print(" *");
            }
        System.out.println("");
        }
    }
//      Problem 5 - Fibonacci series
    public static int fib(int x){
        if (x==1){
            return 0;
        } else if (x==2){
            return 1;
            }
        else {
            return fib(x-1)+fib(x-2);
        }
    }

//    Problem 6
    public static void patternRec01(int x){
        if (x>0){
            patternRec01(x-1);
            for (int i=0; i<x; i++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
//    Problem 7 - Temperature celsius to fahrenheit converter
    public static float celsiusToFahrenheit(){
        float x, a;
        System.out.print("Enter temperature in celsius: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        System.out.print("Fahrenheit: ");
        return (x*9/5)+32; //Conversion formula
    }

    public static void main(String[] args) {
//        table(5);
//        pattern1(5);
//        System.out.println(sumRec(3));
//        pattern2(5);
//        System.out.println(fib(10));
//        patternRec01(5);
//        System.out.println(celsiusToFahrenheit());
    }
}
