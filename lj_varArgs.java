package com.learningJava;

public class lj_varArgs {
   /* static int sum(int a,int b){  // Old approach
        return a+b;
    }*/
    public static int sum(int ...arr){
        int result = 0;
        for (int a: arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varArgs");
        System.out.println(sum(64,72,98,246,67657,47367,28226,45365,2002073,1426267363)); // This method can be used to do a sum of as many integer as needed without creating multiple overloading method.
    }
}
