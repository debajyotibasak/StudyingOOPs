package com.debo.java.oops.polymorphism.overriding;

public class Rule2Exception {
    class Parent {
        void m1() throws RuntimeException {
            System.out.println("From parent m1()");
        }
    }

    class Child1 extends Parent {
        // no issue while throwing same exception
        @Override
        void m1() throws RuntimeException {
            System.out.println("From child1 m1()");
        }
    }

    class Child2 extends Parent {
        // no issue while throwing subclass exception
        @Override
        void m1() throws ArithmeticException {
            System.out.println("From child2 m1()");
        }
    }

    class Child3 extends Parent {
        // no issue while not throwing any exception
        @Override
        void m1() {
            System.out.println("From child3 m1()");
        }
    }

    class Child4 extends Parent {
        // compile-time error
        // issue while throwing parent exception
//        @Override
//        void m1() throws Exception {
//            System.out.println("From child4 m1()");
//        }
    }
}
