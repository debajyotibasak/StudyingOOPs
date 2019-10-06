package com.debo.java.oops.classes;

public class MethodLocalInnerClass {

    void outerMethod() {
        System.out.println("This is outer method");

        class Inner {
            void innerMethod() {
                System.out.println("This is inner method");
            }
        }

        Inner inner = new Inner();
        inner.innerMethod();
    }

    public static void main(String[] args) {
        MethodLocalInnerClass mlc = new MethodLocalInnerClass();
        mlc.outerMethod();
    }
}
