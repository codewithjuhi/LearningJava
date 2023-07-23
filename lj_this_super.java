package com.learningJava;

class ekClass{
    int a;
    public int getA() {
        return a;
    }
    ekClass(int v){
        this.a = v;
    }
    public int returnone(){
        return 1;
    }
}
class doClass extends ekClass{
    doClass(int c){
        super(c);
        System.out.println("I'm a constructor");
    }
}
public class lj_this_super {
    public static void main(String[] args) {
        ekClass e = new ekClass(5);
        System.out.println(e.getA());
        doClass d = new doClass(7);
        System.out.println(d.getA());
    }
}
