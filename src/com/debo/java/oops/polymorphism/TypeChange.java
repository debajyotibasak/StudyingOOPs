package com.debo.java.oops.polymorphism;

public class TypeChange {

    private int sum(int param1, int param2) {
        return param1 + param2;
    }

    private double sum(double param1, double param2) {
        return param1 + param2;
    }

    public static void main(String[] args) {
        TypeChange s = new TypeChange();
        System.out.println(s.sum(1, 2));
        System.out.println(s.sum(1.0, 2.0));
    }
}
