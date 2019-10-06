package com.debo.java.oops.classes;

public class StaticInnerMethod {
    class StaticInner {
//        public static void show() {
//            System.out.println("Show static");
//        }
        // Here The inner class cannot have a static method. It throws error
        // "modifier static only allowed in constant variables declaration"
    }

    public static void main(String[] args) {
//        StaticInner.show();
    }
}
