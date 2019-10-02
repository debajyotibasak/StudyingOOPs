package com.debo.java.oops.polymorphism.overriding;

public class OuterPrivateOverriddenInner {

    private String msg = "GeeksforGeeks";

    private void fun() {
        System.out.println("Outer Private Method");
    }

    public class Inner extends OuterPrivateOverriddenInner {
        private void fun() {
            System.out.println("Accessing Private Member of Outer: " + msg);
        }
    }

    public static void main(String[] args) {
        OuterPrivateOverriddenInner outer = new OuterPrivateOverriddenInner();
        Inner inner = outer.new Inner();

        inner.fun();

        outer = inner;
        outer.fun();
    }
}
