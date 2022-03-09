package Practice;

import java.util.Scanner;

public class NegativeLeftSidePointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter lenghth of array");
        int n = sc.nextInt();
        System.out.println("enter array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rearrangeArray(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    static void rearrangeArray(int[] arr, int low, int high) {
        int temp;
        while (low <= high) {
            if (arr[low] < 0 && arr[high] < 0)
            {
                low++;

            } else if (arr[low] > 0 && arr[high] > 0)
            {
                high--;
            } else if (arr[low] > 0 && arr[high] < 0)
            {
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            } else
            {
                low++;
                high--;
            }
        }

    }

}

