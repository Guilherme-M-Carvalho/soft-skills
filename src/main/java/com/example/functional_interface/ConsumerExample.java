package com.example.functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Consumer<Integer> numPar = (num) -> {
            if(num % 2 == 0){
                System.out.println(num);
            }
        };

        nums.stream().forEach(numPar);
        nums.stream().forEach((num) -> {
            if(num % 2 != 0){
                System.out.println(num);
            }
        });
    }
}
