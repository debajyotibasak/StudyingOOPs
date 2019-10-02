package com.debo.java.oops.polymorphism.overriding;

public class FinalNotOverridden {

    public static class Parent {
        public final void show() {
            System.out.println("Final");
        }
    }

    public static class Children extends Parent {
//        public void show() {
//        }
//        Method showing error
    }
}
