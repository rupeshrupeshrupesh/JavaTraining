package com.example.demo.Java8Stream.streamApi.fixedLengthOfStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FixedLength {

    public static void main(String[] args) {


//    There are multiple ways using which we can create fix length streams.
//
//    1. Using Stream.of() method
//
//    2. Using Collection.stream() method
//
//    3. Using Stream.builder() method

        List<Integer> stream = Stream.of(1, 2, 3, 4, 6,7,5).collect(Collectors.toList());
        System.out.println(stream);

        Integer[] numbers = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(numbers);
        System.out.println(list.stream());

    }
}

