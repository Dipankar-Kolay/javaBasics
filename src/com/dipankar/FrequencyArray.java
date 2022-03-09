package com.dipankar;

import java.util.Scanner;


public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        //enter elements in arrays
        System.out.println("enter elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] fr = new int[size];
        int visited = -1;
        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited) fr[i] = count;
        }
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for (int i = 0; i < size; i++) {
            if (fr[i] != visited) System.out.println("    " + arr[i] + "    |    " + fr[i]);

        }

        System.out.println("----------------------------------------");
    }
}
