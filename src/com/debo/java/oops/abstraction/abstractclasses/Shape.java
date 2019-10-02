package com.debo.java.oops.abstraction.abstractclasses;

abstract class Shape {
    String color;
    public abstract double area();
    public abstract String print();

    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}