package com.learningJava;

public class lj_recursion {

    public static int factorial(int n){  // Recursive approach for calculating the factorial of a given number.
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1); //Recursive Call
        }
    }

    public static int fibonacci(int n){  // Recursive approach for printing fibonacci series.
        if (n<=1){
            return n;
        }
        else {
            return fibonacci(n-1)+fibonacci(n-2); //Recursive Call
        }
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 4 is: "+factorial(4));

        int n =10;
        System.out.print("Fibonacci series: ");
        for (int i=0; i<=n; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
