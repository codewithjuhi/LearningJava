package com.learningJava;
interface bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements bicycle{
    void blowHorn(){
        System.out.println("Blowing horn..");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake..");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedup..");
    }
}
public class lj_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        System.out.println(cycleHarry.a); // You can create properties in interfaces, but you cannot modify them as they are final
    }
}
