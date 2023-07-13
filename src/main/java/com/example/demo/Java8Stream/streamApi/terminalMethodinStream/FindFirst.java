package com.example.demo.Java8Stream.streamApi.terminalMethodinStream;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {


        List<String> stringList
                = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");
        System.out.println("Example - FindFirst\n");

        String s=stringList.stream().findFirst().get();
        System.out.println(s);

    }
}
