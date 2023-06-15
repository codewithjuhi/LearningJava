package com.learningJava;

public class lj_Arrays2 {
    public static void main(String[] args) {

        int[] marks = {100, 60, 70, 90, 86};
//        System.out.println(marks.length);
//        Displaying the array(While Loop)
       /* int i=0;
        while (i<marks.length){
            System.out.println(marks[i]);
            i++;
        }*/

//        Displaying the array (For Loop)
        System.out.println("Printing the array ...");
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
//        Now displaying in reverse order.
        System.out.println("Printing the array in reverse ...");
        for (int i= marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
//        Now using for-each loop.
        System.out.println("Printing the Array(For-each loop)");
        for (int element: marks){
            System.out.println(element);
        }
    }
}
