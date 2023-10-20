package com.learningJava;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<=40000){
            System.out.println("My thread running");
            System.out.println("I'm Happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<=40000){
            System.out.println("My thread2 running");
            System.out.println("I'm sad!");
            i++;
        }
    }
}

public class lj_Threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
