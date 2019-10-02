package com.debo.java.oops.polymorphism.overloading;

public class Sum {

    private int sum(int param1, int param2) {
        return param1 + param2;
    }

    private int sum(int param1, int param2, int param3) {
        return param1 + param2 + param3;
    }

    private double sum(double param1, double param2) {
        return param1 + param2;
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum(1, 2));
        System.out.println(s.sum(1.0, 2.0));
        System.out.println(s.sum(1, 2, 3));
    }
}
