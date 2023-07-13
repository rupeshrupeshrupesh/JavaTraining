package com.example.demo.Java8Stream.streamApi.terminalMethodinStream;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        List<String> stringList
                = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");

        stringList.stream().forEach(s-> System.out.println(s));


    }
}
