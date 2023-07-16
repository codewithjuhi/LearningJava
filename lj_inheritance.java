package com.learningJava;

// It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class.
class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I'm in base, setting x now");
        this.x = x;
    }

    public void printme(){
        System.out.println("I'm a constructors");
    }
}
class Derived extends base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class lj_inheritance {
    public static void main(String[] args) {
//        Creating an object for base class
        base b = new base();
        b.setX(5);
        System.out.println(b.getX());

//        Creating an object for Derived class
        Derived d = new Derived();
        d.setX(4);
        d.setY(25);
        System.out.println(d.getX());
        System.out.println(d.getY());

    }
}
