package com.debo.java.oops.classes;

public class StaticInnerClass {

    public static void outerMethod() {
        System.out.println("Inside Method");
    }

    public static class Inner {
        public static void main(String[] args) {
            outerMethod();
            System.out.println("Outside Method");
        }
    }
}
