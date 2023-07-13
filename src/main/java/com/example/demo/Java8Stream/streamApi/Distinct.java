package com.example.demo.Java8Stream.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<String> stringList =
                Arrays.asList("One", "Two", "Three", "Four", "Five", "One","Five");

        List ss=stringList.stream().distinct().collect(Collectors.toList());
        System.out.println(ss);

    }
}
