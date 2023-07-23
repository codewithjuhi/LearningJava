package com.learningJava;
class Phone{
    public void greet(){
        System.out.println("Good Morning!");
    }
    public void  on(){
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone{
    public void welcome(){
        System.out.println("You're Welcome");
    }
    public void  on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class lj_dynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();

        obj.greet();
        obj.on();
    }
}
