package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int Validate() {
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            try {
                a = Integer.parseInt(sc.next());
                if (a < 0) {
                    System.out.println("Input must > 0 Re-enter !!!");
                } else {
                    break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Input Re-enter !!!");
            }
        }
        return a;
    }

    public static int[] CreatArray(int n){
        int arr[];
        arr = new int[n];
        Random rd = new Random();

        for (int i=0;i<n;i++){
            arr[i] = rd.nextInt(n);
        }
        System.out.println("The array: " + Arrays.toString(arr));
        return arr;
    }

    public static void Search(int[] arr,int s){
        //int[] arr;
        //arr = new int[a];

        System.out.println("test 1");
        for (int c = 0; c < arr.length; c++){
            if (s == arr[c]){
                System.out.println("Number " + s + " is present at index: " + c);
            }
            if (c == arr.length-1){
                System.out.println("Number " + s + " is not in the array");
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        int a;
        int[] arr;
        System.out.println("Enter number of element: ");

        a = Validate();
        arr = CreatArray(a);

        int s;
        System.out.println("Enter search number" );
        s = Validate();
        Search(arr,s);
    }
}
