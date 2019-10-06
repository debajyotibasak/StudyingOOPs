package com.debo.java.oops.classes;

public class NestedClass {

    class Inner {
        public void show() {
            System.out.println("In a nested class method");
        }
    }

    public static void main(String[] args) {
        NestedClass.Inner nc = new NestedClass().new Inner();
        nc.show();
    }
}
