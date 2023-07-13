package com.example.demo.Java8Stream.streamApi.terminalMethodinStream;

import java.util.Arrays;
import java.util.List;

public class Max {
    public static void main(String[] args) {
//        max − returns the largest element of the stream. Compares elements based on comparator predicate passed.


                List<String> stringList
                = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");


        String s=stringList.stream().max((s1,s2)->s1.compareTo(s2)).toString();
        System.out.println(s);
    }

}
