package Practice;

import java.util.Scanner;

public class DutchNationalFlag {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        System.out.println("enter elements of array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sortzot(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    static void sortzot(int[] arr,int n)
    {
        int low=0;
        int mid = 0;
        int high = n-1;
        int temp=0;
        while(mid<=high){
            switch (arr[mid]){
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                    case 1: {
                        mid++;
                        break;
                    }
                    case 2: {
                        temp = arr[mid];
                        arr[mid]= arr[high];
                        arr[high]=temp;
                        high--;
                        break;
                    }

                }

        }
    }
}
