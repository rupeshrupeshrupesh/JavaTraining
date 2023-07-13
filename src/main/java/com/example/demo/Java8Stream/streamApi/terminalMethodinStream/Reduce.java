package com.example.demo.Java8Stream.streamApi.terminalMethodinStream;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {

//        reduce − reduces all elements to a single element using the predicate passed.


                List<String> stringList
                = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");
        System.out.println("Example - allMatch\n");

        String reduceList=stringList.stream().reduce((s1,s3)->{return s1+","+s3;}).get();
        System.out.println(reduceList);

    }
}
