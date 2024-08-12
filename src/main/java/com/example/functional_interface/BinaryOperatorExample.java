package com.example.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado = nums.stream()
                                .reduce(0, somar);

        System.out.println("A soma dos numeros é: " + resultado);
    }
}
