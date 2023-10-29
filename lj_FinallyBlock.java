package com.learningJava;

public class lj_FinallyBlock {
    public static void main(String[] args) {
        int a = 100;
        int b = 5;
        while (true){
            try {
                int c = a/b;
                System.out.println(c);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Finally!!!");  // The finally block will run in both the situations either the exception is handled or not.
            }
            b--;
        }
    }
}
