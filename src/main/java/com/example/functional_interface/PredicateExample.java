package com.example.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");
        Predicate<String> maisDeCincoCarac = palavra -> palavra.length() > 5;
        palavras.stream()
            .filter(maisDeCincoCarac)
            .forEach(System.out::println);
    }
}
