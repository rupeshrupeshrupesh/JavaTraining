package com.example.demo.Java8Stream.streamApi.terminalMethodinStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
//        collect − each element is stored into the collection passed.
        List<String> stringList
                = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");
        System.out.println("Example - anyMatch\n");
        //anyMatch - check if One is present?

     List newList=stringList.stream().filter(s->s.length()>4).collect(Collectors.toList());
        System.out.println(newList);
    }
}
