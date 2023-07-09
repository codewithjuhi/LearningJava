package com.learningJava;

class MyEmployees {
    private String name;
    private int id;

    public MyEmployees(String MyName, int MyId){  // Constructor
        id = MyId;
        name = MyName;
    }
    public void setName(String n) {
        name = n;
    }

    public void setId(int m) {
        id = m;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
public class lj_constructors {
    public static void main(String[] args) {
        MyEmployees Aryan = new MyEmployees("Aryan", 7777); // Method overloading can also be done in the case of constructors.
        System.out.println(Aryan.getName());
        System.out.println(Aryan.getId());
    }
}
