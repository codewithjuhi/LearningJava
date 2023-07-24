package com.learningJava;
//        Problem - Create a class circle and use inheritance to create a class cylinder from it.
class circle01{
    public int r;
    circle01(int radius){
        this.r=radius;
    }
    public double area(){
        return Math.PI*this.r*this.r;
    }
}
class cylinder01 extends circle01{
    public int height;
    cylinder01(int r, int h){
        super(r);
        this.height = h;
    }
    public double volume(){
        return area()*height;
    }

}
public class practiceSet05_Inheritance {
    public static void main(String[] args) {
//        circle01 obj = new circle01(5);
        cylinder01 obj = new cylinder01(5,10);
        System.out.println("Volume of cylinder is: "+obj.volume());
    }
}
