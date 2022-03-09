package com.dipankar;

import java.util.Scanner;

public class DuplicateArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("enter elements of array");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        //orginal array

        //logic to find duplicates

        for(int i=0; i<size; i++){
            for(int j = i+1; j<size; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
