package com.debo.java.oops.polymorphism;

public class OrderChange {

    private int sum(int param1, double param2) {
        return param1 + (int) param2;
    }

    private int sum(double param1, int param2) {
        return (int) param1 + param2;
    }

    public static void main(String[] args) {
        OrderChange s = new OrderChange();
        System.out.println(s.sum(1, 2.0));
        System.out.println(s.sum(1.0, 2));
    }
}
