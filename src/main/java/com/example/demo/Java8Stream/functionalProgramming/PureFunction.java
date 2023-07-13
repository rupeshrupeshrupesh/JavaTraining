package com.example.demo.Java8Stream.functionalProgramming;

public class PureFunction {
    public static void main(String[] args) {
        int a=20;

        int v=pureFunction(2,3);
        System.out.println(v);

    }
    static int pureFunction(int a,int b)
    {
        return a+b;

    }
}
