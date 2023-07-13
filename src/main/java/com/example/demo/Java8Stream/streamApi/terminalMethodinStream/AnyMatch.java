package com.example.demo.Java8Stream.streamApi.terminalMethodinStream;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {
//        anyMatch − If predicate returns true for any of the element,
//        it returns true. If no element matches, false is returned.

        List<String> stringList
                = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");
        System.out.println("Example - anyMatch\n");
        //anyMatch - check if One is present?


        boolean b = stringList.stream().anyMatch(check -> check.contains("One"));
        System.out.println(b);
    }
}
