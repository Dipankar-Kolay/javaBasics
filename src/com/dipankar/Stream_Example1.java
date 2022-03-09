package com.dipankar;
import java.util.*;
import java.util.stream.IntStream;

public class Stream_Example1 {
    public static void main(String[] args) {


    int sum = 0;
    for(int i=0;i<=100;i++){
        sum=sum+i;

    }
        System.out.println(sum);
    int sum1=IntStream.rangeClosed(0,100)
            .sum();
        System.out.println(sum1);

}
}
