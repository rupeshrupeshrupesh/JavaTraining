package com.example.demo.Java8Stream.functionalProgramming;

public class ImpureFunction {
    private static double  value=0.025;
    public static void main(String[] args) {

       double c= impure(10.0,20.0);
        System.out.println(c);
        double c2=impure(10.0,20.0);
        System.out.println(c2);
    }
    static double impure(double a,double b){
        value = Math.random();
        return value+a+b;
    }
}
