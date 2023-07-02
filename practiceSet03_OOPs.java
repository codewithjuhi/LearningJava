package com.learningJava;

//  Problem 1
class EE{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
        System.out.println("Name set to: "+name);
    }
}
//    Problem 2
class CellPhone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
}
//  Problem 3
class square{
    int side;
    public int calcArea(){
        return side*side;
    }
    public int calcPerimeter(){
        return side*4;
    }
}
public class practiceSet03_OOPs {
    public static void main(String[] args) {
        /*EE Employee1 = new EE();
        Employee1.name = "Aryan";
        Employee1.salary = 1000000;

        System.out.println(Employee1.getName());
        System.out.println(Employee1.getSalary());
        Employee1.setName("Harry");*/
/*

        CellPhone mobile = new CellPhone();

        mobile.vibrate();
        mobile.ring();
*/
        square shape = new square();
        shape.side = 5;
        System.out.println("Area: "+shape.calcArea());
        System.out.println("Perimeter: "+shape.calcPerimeter());
    }
}
