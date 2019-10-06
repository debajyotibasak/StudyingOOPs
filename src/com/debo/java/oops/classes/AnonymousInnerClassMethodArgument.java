package com.debo.java.oops.classes;

public class AnonymousInnerClassMethodArgument {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Child Thread");
            }
        });
        thread.start();
        System.out.println("Main Thread");
    }
}
