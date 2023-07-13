package com.example.demo.Java8Stream.streamApi.terminalMethodinStream;

import java.util.Arrays;
import java.util.List;

public class NoneMatch {
    public static void main(String[] args) {
//        noneMatch − If no element matches, true is returned
//        otherwise false is returned.

        List<String> stringList
                = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");
        System.out.println("Example - noneMatch\n");
        boolean bb=stringList.stream().noneMatch(s->s.length()>6);
        System.out.println(bb);
    }
}
