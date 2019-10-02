package com.debo.java.oops.polymorphism.overriding;

public class Super {

    public static class Parent {
        public void fun() {
            System.out.println("This is parent");
        }
    }

    public static class Children extends Parent {
        @Override
        public void fun() {
            super.fun();
            System.out.println("This is child");
        }
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.fun();

        Parent c = new Children();
        c.fun();
    }
}
