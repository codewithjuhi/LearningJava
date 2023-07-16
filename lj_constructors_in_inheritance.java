package com.learningJava;

class base1{
    base1() {
        System.out.println("I'm a constructor");
    }
    base1(int x) {
        System.out.println("I'm an overloaded constructor with value of x as: "+ x);
    }
}

class derived1 extends base1{
    derived1(){
//        super(0);
        System.out.println("I'm a derived class constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("I'm an overloaded constructor of derived with value of y as: "+ y);
    }
}

class childOfDerived extends derived1{
    childOfDerived(){
        System.out.println("I'm a child of derived constructor");
    }
    childOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I'm an overloaded child of derived constructor with value of z as: "+z);
    }
}
public class lj_constructors_in_inheritance {
    public static void main(String[] args) {
//        base1 b = new base1();
//        derived1 d = new derived1();
//        derived1 d = new derived1(4,5);
//        childOfDerived cd = new childOfDerived();
        childOfDerived cd = new childOfDerived(14,25,64);
    }
}
/*
When a derived class is extended from the base class, the constructor of the
 base class is executed first followed by the constructor of the derived class.
*/
