package com.company;


import java.util.Scanner;

public class Main {

    public static int summ(int a, int b){
        return a + b;
    }

    public static double summ(double a, double b){
        return a + b;
    }

    public static  int summ(int a, int b, int e){
        return a + b + e;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int e = 12;
        double c = 12.3123;
        double d = 123.901;
        System.out.println("summ(int,int) = " +summ(a,b));
        System.out.println("summ(int,int,int) = " +summ(a,b,e));
        System.out.println("summ(double,double) = " +summ(c,d));

    }

}

