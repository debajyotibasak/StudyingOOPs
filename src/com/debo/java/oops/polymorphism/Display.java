package com.debo.java.oops.polymorphism;

public class Display {

    private void show(int x) {
        System.out.println("In int " + x);
    }

    private void show(String s) {
        System.out.println("In String " + s);
    }

    private void show(byte b) {
        System.out.println("In byte " + b);
    }

    public static void main(String[] args) {
        Display d = new Display();

        byte a = 25;
        d.show(a); // It goes to byte argument

        d.show("Hello macha, Kannada Gotilla"); // Its goes to String argument

        d.show(250); // Its goes to Int argument

        d.show('A'); // Since char is not available, so the data-type higher than char in terms of range is int.

        // d.show(7.5); Error since double is not available and float is not available
    }
}
