package com.learningJava;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return super.toString()+ " This is a exception";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+" This is a exception";
    }
}
public class lj_ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<9){
            try {
                throw new MyException();
            }catch (Exception e){
                System.out.println(e.getMessage());

//                e.printStackTrace();
            }
        }
    }
}
