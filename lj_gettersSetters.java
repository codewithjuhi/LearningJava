package com.learningJava;

class Employees{
    private String name;
    private int id;
    public void setName(String n){
        name = n;
    }
    public void setId(int m){
        id = m;
    }
   public String getName(){
        return name;
   }
   public int getId(){
        return id;
   }
}
public class lj_gettersSetters {
    public static void main(String[] args) {
        Employees ee = new Employees();
//      Setters =>
        ee.setName("Aryan");
        ee.setId(777);
//      Getters =>
        System.out.println(ee.getName());
        System.out.println(ee.getId());

    }
}
