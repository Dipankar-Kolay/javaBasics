package com.dipankar;

/* 1) WAP that outputs the string representation of numbers from 1 to n.
but for multiples of three it should output "Fizz" instead of number and for
the multiples of five output "Buzz". for number which are multiples of both three
and five output "FizzBuzz".


* */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LCInteger_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fizzBuzz(n));
    }
    public static  List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}

