package com.dipankar;

import java.util.*;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter target value");
        int target = sc.nextInt();
        System.out.println("enter array values");
        int [] arr = new int[5];
        for(int i=0; i<5; i++){
           arr[i] = sc.nextInt();
        }
        int [] result = sumMethod(arr,target);
        System.out.println(result[0] +" "+result[1]);
    }
    public static  int [] sumMethod(int arr[], int target){
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i =0; i<5;i++){
            int delta = target - arr[i];
            if(mp.containsKey(delta)){
            int [] result = {mp.get(delta),i};
            return result;
            }
            mp.put(arr[i], i);
        }
        return new int[] {-1,-1};
    }
}
