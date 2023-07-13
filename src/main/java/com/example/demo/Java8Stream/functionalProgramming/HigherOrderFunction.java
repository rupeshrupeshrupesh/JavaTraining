package com.example.demo.Java8Stream.functionalProgramming;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class HigherOrderFunction {
    public static void main(String[] args) {
//        int[] a={1,2,5,8,9,7,6};
//        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
////        using Lambda Function
//        System.out.println(numbers);
//
//        //Passing a function as lambda expression
//        Collections.sort(numbers, (a,b) ->{ return a.compareTo(b); });
////        Collections.sort(numbers,(a,b)->{
////            return a.compareTo(b);
////        });
////        System.out.println(numbers);
////        Collections.sort(numbers, (a,b) ->{ return a.compareTo(b); });
//        System.out.println(numbers);
        List<Integer> numbers = Arrays.asList(3, 4, 6, 7, 9);

        //Passing a function as lambda expression
        Collections.sort(numbers, (a,b) ->{ return a.compareTo(b); });

        System.out.println(numbers);
        Comparator<Integer> comparator = (a,b) ->{ return a.compareTo(b); };
        Comparator<Integer> reverseComparator = comparator.reversed();

        //Passing a function
        Collections.sort(numbers, reverseComparator);
        System.out.println(numbers);


    }
}
