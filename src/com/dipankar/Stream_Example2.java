package com.dipankar;

import java.util.*;
import java.util.stream.Collectors;


public class Stream_Example2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,33,4,5,6,6,7,8);
        List<Integer> u = new ArrayList<>();
        for(Integer i: integerList){
            if(!u.contains(i)){
                u.add(i);
            }

        }
        System.out.println(u);
        List<Integer> u1 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(u1);

    }
}
