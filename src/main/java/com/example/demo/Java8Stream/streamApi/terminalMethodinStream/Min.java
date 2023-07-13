package com.example.demo.Java8Stream.streamApi.terminalMethodinStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Min {
    public static void main(String[] args) {

//        min − returns the smallest element of the stream. Compares elements based on comparator predicate passed.
        List<Integer> stringList
                = Arrays.asList(1,12,13,14,15,60,66,70);
        Optional<Integer> max=stringList.stream().max((s1, s2)->s1.compareTo(s2));
        System.out.println(max);
        Optional<Integer> min=stringList.stream().min((s1, s2)->s1.compareTo(s2));
        System.out.println(min);


    }
}
