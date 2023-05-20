package com.learning;

public class lj_operatorPrecedence {
    public static void main(String[] args) {
//        Precedence & Associativity
        int a = 6 * 5 - 34 / 2;
//        Highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity.
        int b = 60 / 5 - 34 * 2;
        System.out.println(a);
        System.out.println(b);
    }
}
