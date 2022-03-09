package com.dipankar;

import java.util.*;

public class RemoveDuplicateElement_Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("enter elements inside array");
        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();

        }
        removeDuplicate(arr,size);

    }public static void removeDuplicate(int arr[], int size) {
        HashMap<Integer,Boolean> mp = new HashMap<>();
        for(int i=0; i<size; i++){
            if(mp.get(arr[i]) == null){
                System.out.println(arr[i] + " ");
                mp.put(arr[i],true);
            }
        }

    }
}
