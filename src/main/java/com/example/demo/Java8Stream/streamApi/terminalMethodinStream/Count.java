package com.example.demo.Java8Stream.streamApi.terminalMethodinStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Count {
    public static void main(String[] args) {
//        count − returns count of elements passed through intermediate methods.
        List<String> stringList
                = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");

        long count=stringList.stream().count();
        System.out.println(count);
        long count2=stringList.stream().filter(s->s.length()>4).count();
        System.out.println(count2);


    }
}
