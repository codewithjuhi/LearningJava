package com.learningJava;

public class lj_Methods {
   static int logic(int a, int b){
        int c;
        if (a>b){c = a+b;}
        else {c = a*b;}
        return c;
    }

    public static void main(String[] args) {
        int x =10;
        int y =20;
/*
        Method invocation using object creation
        lj_Methods obj = new lj_Methods();
        int z =obj.logic(x,y);
*/
        int z = logic(x,y);
        System.out.println(z);
    }
}
