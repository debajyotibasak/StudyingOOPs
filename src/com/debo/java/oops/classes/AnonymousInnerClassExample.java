package com.debo.java.oops.classes;

public class AnonymousInnerClassExample {

    interface Age {
        int x = 24;
        void getAge();
    }

    public static void main(String[] args) {
        Age age = new Age() {
            @Override
            public void getAge() {
                System.out.println("Age is: " + x);
            }
        };
        age.getAge();
    }
}
