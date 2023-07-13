package com.example.demo.Java8Stream.functionalProgramming;

import jakarta.persistence.criteria.CriteriaBuilder;

public class FirstClassFunction {
    public static void main(String[] args) {
//        A function is called a first class function if it fulfills the following requirements.
//
//                It can be passed as a parameter to a function.
//
//                It can be returned from a function.
//
//        It can be assigned to a variable and then can be used later.
//
//                Java 8 supports functions as first class object using lambda expressions.
//        A lambda expression is a function definition and can be assigned to a variable, can be passed as an argument and can be returned. See the example below −

        Calculator<Integer,Integer> calculator=(a,b)->{
           return a*b;
        };
//        System.out.println(calculator.compute(2,3));
        printResult(calculator,10,10);

    }
    static void printResult(Calculator<Integer,Integer> calculator, int a, int b){
        System.out.println(calculator.compute(a,b));

    }
}
interface Calculator<X, Y> {
    public X compute(X a, Y b);
}

