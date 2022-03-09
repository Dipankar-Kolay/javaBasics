package com.dipankar;
import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements to rotate");
        int n = sc.nextInt();
        System.out.println("enter length of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // original array
        System.out.println("orginal array");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + "");
        }
        for (int i = 0; i < n; i++) {
            int j, first;
            //Stores the first element of the array
            first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                //Shift element of array by one
                arr[j] = arr[j + 1];
            }
            //First element of array will be added to the end
            arr[j] = first;
        }
        System.out.println();
        //Displays resulting array after rotation
        System.out.println("Array after left rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
