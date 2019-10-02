package com.debo.java.oops.polymorphism.overriding;

public class Example1 {

    public static class Parent {
        public void show() {
            System.out.println("In Parent class");
        }
    }

    public static class Child extends Parent {
        @Override
        public void show() {
            System.out.println("In Child Class");
        }
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show();

        Parent child = new Child();
        child.show();
    }
}
