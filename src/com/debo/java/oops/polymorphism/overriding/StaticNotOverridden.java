package com.debo.java.oops.polymorphism.overriding;

public class StaticNotOverridden {

    public static class Parent {

        // Static method in base class
        // which will be hidden in subclass
        public static void show() {
            System.out.println("Show Parent");
        }

        public void showThis() {
            System.out.println("Show This");
        }
    }

    public static class Children extends Parent {

        // This method hides m1() in Parent
        public static void show() {
            System.out.println("Show Children");
        }

        @Override
        public void showThis() {
            super.showThis();
        }
    }

    public static void main(String[] args) {
        Parent.show();
        Children.show();

        Parent p = new Parent();
        p.showThis();

        Parent c = new Children();
        c.showThis();
    }
}
