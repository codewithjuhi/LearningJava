package com.learningJava;

public class practice_set01 {
    public static void main(String[] args) {
        float[] a = {12.5f, 89.0f, 51.8f, 87.87f, 23.86f};
//      Problem 1
        /*float sum =0;
        for (float element: a) {
            sum = sum+element;
        }
        System.out.println(sum);*/

//        Problem 2
       /* float num = 12.5f;
        boolean isInArray = false;
        for (float element : a) {
            if (element==num){
                isInArray = true;
                break;
            }

        }
        if (isInArray){
            System.out.println("Value present");
        }
        else {
            System.out.println("Value absent");
        }*/

//        Problem 3
       /* float sum = 0;
        float average = 0;
        for (float element: a) {
            sum = sum+element;
        }
        average = sum/ a.length;
        System.out.println("Average: "+average);*/

//        Problem 4 - Creating and adding 2*3 matrices
               /* int [][] mat1 = {{1, 2, 3}, {4, 5, 6}};
                int [][] mat2 = {{2, 4, -3}, {12, -11, 17}};
                int [][] result = {{0, 0, 0},{0, 0, 0}};

                for (int i=0; i<mat1.length; i++){ // Row number of times
                    for (int j=0; j< mat1[i].length; j++){ // Column number of times
//                        System.out.format("i = %d  j = %d\n",i,j);
                        result[i][j] = mat1[i][j] + mat2[i][j];
                        System.out.print(result[i][j]+ " ");
                    }
                    System.out.println("");
                }*/

//        Problem 5 - Reversing a array and storing it in another array
        /*float[] b = new float[5];

        for (int j=a.length-1; j>=0; j--){
            for (int i=0; i<a.length; i++)
                b[i]=a[j];
        System.out.print(b[j]+ " ");
        }*/

//        Problem 6 - Reversing an array using swap-element method [**Important]
        /*float temp;
        int l = a.length;
        int x = Math.floorDiv(l, 2);
        for (int i=0; i<x; i++){
//            Swap a[i] and a[l-1-i]
            temp = a[i];
            a[i] = a[l-1-i];
            a[l-1-i] = temp;
        }
        for (float element: a) {
            System.out.print(element + " ");
        }*/

//        Problem 7
        /*float max = Integer.MIN_VALUE; // Integer.MIN_VALUE represents the minimum value an integer can hold
        for (float element: a) {
            if (element>max){
                max = element;
            }
        }
        System.out.println("The maximum element in the array is: "+ max);*/

//        Problem 8
       /* boolean isSorted = true;
        for (int i=0; i<a.length-1; i++){
            if (a[i] > a[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Sorted array");
        }
        else{
            System.out.println("Unsorted array");
        }*/
    }
}
