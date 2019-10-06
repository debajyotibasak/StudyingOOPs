package com.debo.java.oops.classes;

public class NestedInnerClass {

    class Inner {
        public void show() {
            System.out.println("In a nested class method");
        }
    }

    public static void main(String[] args) {
        NestedInnerClass.Inner nc = new NestedInnerClass().new Inner();
        nc.show();
    }
}
