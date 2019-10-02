package com.debo.java.oops.polymorphism.overriding;

public class Rule1Exception {

    class Parent {
        void m1() {
            System.out.println("From parent m1()");
        }

        void m2() {
            System.out.println("From parent  m2()");
        }
    }

    class Child extends Parent {
        // no issue while throwing unchecked exception
        @Override
        void m1() throws ArithmeticException {
            System.out.println("From child m1()");
        }

        // compile-time error
        // issue while throwing checked exception
//        @Override
//        void m2() throws Exception {
//            System.out.println("From child m2");
//        }
    }
}
