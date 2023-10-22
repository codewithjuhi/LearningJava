package com.learningJava;

class MyNewThr1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<=50){
            System.out.println("Thank You! "+ this.threadId());
            i++;
        }
    }
}
public class lj_ThreadMethods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr1 t2 = new MyNewThr1();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}
