package com.learning;

import java.util.Scanner;

public class lj_excercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        byte c = sc.nextByte();
        byte d = sc.nextByte();
        byte e = sc.nextByte();

        int sum = a+b+c+d+e;
        int calPercentage = sum * 100 / 500;
        System.out.println("The percentage is: "+calPercentage);

    }
}
