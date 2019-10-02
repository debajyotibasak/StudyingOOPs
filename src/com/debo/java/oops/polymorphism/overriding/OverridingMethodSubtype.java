package com.debo.java.oops.polymorphism.overriding;

public class OverridingMethodSubtype {

    public static class Parent {
        public Number fun() {
            return 2;
        }
    }

    public static class Children extends Parent {
        @Override
        public Integer fun() {
            return 3;
        }
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.fun());

        Parent c = new Children();
        System.out.println(c.fun());
    }
}
