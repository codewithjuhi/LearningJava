package com.learningJava;

class cylinder{
    private final int r;
    private final int h;

    public cylinder(int radius, int height){
        r = radius;
        h = height;
    }
    public void calcSurfaceArea(){
        System.out.println("Surface Area of cylinder: "+(2*Math.PI*r*h)+(2*Math.PI*r*r));
    }
    public void calcVolume(){
        System.out.println("Volume of the cylinder: "+Math.PI*r*r*h);
    }
}
public class practiceSet04_Constructors {
    public static void main(String[] args) {
        cylinder c = new cylinder(10, 35);
        c.calcSurfaceArea();
        c.calcVolume();
    }
}
