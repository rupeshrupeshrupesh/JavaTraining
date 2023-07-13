package com.example.demo.Java8Stream.functionalProgramming;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.function.Function;

public class FunctionInterFace {
    public static void main(String[] args) {
//        Functional interfaces have a single functionality to exhibit. For example, a Comparable interface with a single method 'compareTo' is used for comparison purpose. Java 8 has defined a lot of functional interfaces to be used extensively in lambda expressions. Following is the list of functional interfaces defined in java.util.Function package.
//
//        Given below is the list of interfaces in Java8.
//                Functional Interface Example
//        Predicate <T> interface is a functional interface with a method test(Object) to return a Boolean value. This interface signifies that an object is tested to be true or false.
//
//                Create the following Java program using any editor of your choice in, say, C:\> JAVA.

        Function<Integer,Integer> addone=adder(1);
        Function<Integer,Integer> addTwo=adder(2);
        Function<Integer,Integer> addThree=adder(4);


//        result value

        int result = addone.apply(4);
        System.out.println(result);

//        result value

        int resul =addTwo.apply(5);
        System.out.println(resul);

//        result value three

        int res=addThree.apply(5);
        System.out.println(res);


    }
    static Function<Integer, Integer> adder(Integer x){
        return y -> y + x;
    }
}
