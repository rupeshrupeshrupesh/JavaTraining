package com.example.demo.Java8Stream.streamApi.terminalMethodinStream;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
//        If predicate returns false for any of the element,
//        it returns false. If all element matches, true is returned.

        List<String> stringList
                = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");
        System.out.println("Example - allMatch\n");

        boolean b=stringList.stream().allMatch(s->s.contains("One"));
        System.out.println(b);
        boolean checklength=stringList.stream().allMatch(s->s.length()>2);
        System.out.println(checklength);
    }

}
