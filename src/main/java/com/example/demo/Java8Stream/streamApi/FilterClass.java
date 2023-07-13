package com.example.demo.Java8Stream.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterClass {
    public static void main(String[] args) {
//        filter − Filters out non-required elements from a stream based on given criteria.
//        This method accepts a predicate and apply it on each element.
//                If predicate function return true, element is included in returned stream.
        List<String> stringList =
                Arrays.asList("One", "Two", "Three", "Four", "Five", "One");
        List<String> filterList= stringList.stream().filter(f-> f.length()>3).collect(Collectors.toList());
//        when we use and store in stream
//        filterList.forEach(System.out::println);
        System.out.println(filterList);
        for (String s:filterList
             ) {
            System.out.println(s);
        }

        System.out.println("mapp-----??");
    List<String> filername   = stringList.stream().filter(f->{
            return
                    f.charAt(0)=='F';
        }).collect(Collectors.toList());
        for (String ss:filername
             ) {
            System.out.println(ss);
        }
        System.out.println();
    }
}
