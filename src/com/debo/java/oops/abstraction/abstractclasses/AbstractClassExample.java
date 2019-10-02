package com.debo.java.oops.abstraction.abstractclasses;

public class AbstractClassExample {

    public static class Circle extends Shape {

        double radius;

        public Circle(String color, double radius) {
            super(color);
            System.out.println("Circle constructor called");
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * Math.pow(radius, 2);
        }

        @Override
        public String print() {
            return "Circle color: " + color + " Circle area: " + area();
        }
    }

    public static class Square extends Shape {

        double length;
        double width;

        public Square(String color, double length, double width) {
            super(color);
            System.out.println("Circle constructor called");
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length * width;
        }

        @Override
        public String print() {
            return "Square color: " + color + " Square area: " + area();
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle("Red", 2.2);
        Square s = new Square("Blue", 2, 2);

        System.out.println(c.print());
        System.out.println(s.print());
    }
}
