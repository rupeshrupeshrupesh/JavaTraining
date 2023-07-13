package com.example.demo.Java8Stream.functionalProgramming;

public class TypeInrefrence {
    public static void main(String[] args) {
        Join<Integer,Integer,Integer> sum=(a,b) -> a+b;
        System.out.println(sum.computer(10,20));
        Join<String, String, String> concat = (a,b) ->  a+b;
        System.out.println(concat.computer("Hello ","World!"));
    }


}
interface Join<A,B,C>{
   C computer(A a,B b);
}
