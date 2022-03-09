package com.dipankar;
import java.util.*;

public class RemoveDuplicateArray_temp
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements inside array");
        int n = sc.nextInt();
        System.out.println("enter array elements");
        int [] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
         }
        int ans = Duplicate_array(arr,n);
        for(int i=0; i<ans; i++){
            System.out.println(arr[i]);
        }
    }

    public static int Duplicate_array(int arr[], int n){

        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;



    }


}
