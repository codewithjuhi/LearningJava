package com.learningJava;

public class lj_Try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a/b;
            System.out.println("The result is "+c);

        }
        catch (Exception e){
            System.out.println("Program failed to perform");
            System.out.println(e);
        }
    }
}
