package com.learningJava;

import javax.xml.namespace.QName;

class Employee{
    int id;
    String name;
    public void prntDetails(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
}
public class lj_customClass {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
//        Instantiating a new Employee object
        Employee aryan = new Employee();
        Employee harry = new Employee();

//        Setting properties
        aryan.id = 123456789;
        aryan.name = "xyz";

        harry.id = 987654321;
        harry.name = "abc";

//        Printing the attributes
//        System.out.println(aryan.id +" "+ aryan.name);
        aryan.prntDetails();
        harry.prntDetails();
    }
}
