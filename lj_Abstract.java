package com.learningJava;
/*
 An abstract class is a class that is declared abstract—it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.
 An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon), like this:
 abstract void moveTo(double deltaX, double deltaY);
*/

abstract class parent{
    parent(){
        System.out.println("I'm a constructor of parent class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}
abstract class child2 extends parent{
    public void example(){
        System.out.println("I'm good");
    }
}
public class lj_Abstract {
    public static void main(String[] args) {
        child c = new child();

    }
}
