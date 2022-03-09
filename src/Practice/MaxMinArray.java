package Practice;
import java.util.*;

public class MaxMinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        MaxMin(arr,size);

    }
    public static void MaxMin(int arr[], int size){
        int max = 0,min=0;
        if(size ==1){
            max = min = arr[0];
        }
        if(arr[0]>arr[1]){
            max=arr[0];
            min=arr[1];
        }
        max=arr[1];
        min=arr[0];
        for(int i=2;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else
                if(arr[i]<min){
                    min=arr[i];
                }
       }
        System.out.println(max);
        System.out.println(min);

    }
}
