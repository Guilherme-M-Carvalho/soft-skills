package com.example.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {


    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        Function<Integer, Integer> dobrar = num -> num * 2;
    
        List<Integer> numDob = nums.stream()
            .map(dobrar)
            .toList();
        numDob.forEach(System.out::println);
    }
}
