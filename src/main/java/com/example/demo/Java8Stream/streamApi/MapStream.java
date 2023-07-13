package com.example.demo.Java8Stream.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MapStream {
    public static void main(String[] args) {
        List<String> maplist =
                Arrays.asList("One", "Two", "Three", "Four", "Five", "One");
        List<String> mapedList=maplist.stream().map(m-> m.toUpperCase()).collect(Collectors.toList());
        System.out.println(mapedList);
        List<String> list=maplist.stream().map(m-> {
           return m.toLowerCase() ;
        }).collect(Collectors.toList());
        System.out.println(list);
    }
}
