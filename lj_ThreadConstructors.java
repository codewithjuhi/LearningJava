package com.learningJava;

class MyThr extends Thread{
    MyThr(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        System.out.println("Thank You");
//        while (i<=50){
//            System.out.println("I am a thread");
//            i++;
//        }
    }
}
public class lj_ThreadConstructors {
    public static void main(String[] args) {
        MyThr t = new MyThr("Aryan");
        t.start();
        System.out.println(t.threadId());
        System.out.println(t.getName());
    }
}
