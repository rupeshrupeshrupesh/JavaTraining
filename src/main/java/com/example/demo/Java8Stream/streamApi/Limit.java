package com.example.demo.Java8Stream.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Limit {
    public static void main(String[] args) {
        List stringList= Arrays.asList("One", "Two", "Three", "Four", "Five", "One","Five");
        List newString=stringList.stream().limit(2).toList();
        System.out.println(newString);

    }
}
