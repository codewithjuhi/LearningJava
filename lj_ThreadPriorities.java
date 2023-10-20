package com.learningJava;
class MyThr1 extends Thread{
    MyThr1(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i<=50){
            System.out.println("Thank You! "+ this.getName());
            i++;
        }
    }
}
public class lj_ThreadPriorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Aryan1  (Maximum Priority)");
        MyThr1 t2 = new MyThr1("Aryan2");
        MyThr1 t3 = new MyThr1("Aryan3");
        MyThr1 t4 = new MyThr1("Aryan4");
        MyThr1 t5 = new MyThr1("Aryan5");

        t1.setPriority(Thread.MAX_PRIORITY); // More priority is given to this thread.
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
