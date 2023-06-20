package com.learningJava;

public class lj_Method_Overloading {

    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+ a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning " +a+" "+b+" bro!");
    }
    static void tellJoke(){
        System.out.println("I invented a new world!\nPlagiarism!");
    }
    static void change (int[] a){
        a[0] = 98;
    }

    public static void main(String[] args) {
/*
        tellJoke();
        int[] marks = {52,64,54,76,98,86,47};
        change(marks);
        System.out.println(marks[0]);
*/

//        METHOD OVERLOADING STARTS HERE =>

        foo();
        foo(3000);
        foo(3000, 4000);
        
//        This shows that you can create as many methods as you want with the same name but different parameters.
    }
}
