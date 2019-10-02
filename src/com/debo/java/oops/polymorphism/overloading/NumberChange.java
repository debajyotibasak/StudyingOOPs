package com.debo.java.oops.polymorphism.overloading;

public class NumberChange {

    private int sum(int param1, int param2) {
        return param1 + param2;
    }

    private double sum(int param1, int param2, int param3) {
        return param1 + param2 + param3;
    }

    public static void main(String[] args) {
        NumberChange s = new NumberChange();
        System.out.println(s.sum(1, 2));
        System.out.println(s.sum(1, 2, 3));
    }
}
