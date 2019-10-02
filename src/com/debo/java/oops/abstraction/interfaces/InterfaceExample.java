package com.debo.java.oops.abstraction.interfaces;

public class InterfaceExample {

    interface Vehicle {
        void changeGear(int gear);
        void speedUp(int increment);
        void applyBrakes(int decrement);
    }

    public static class Bike implements Vehicle {
        int speed;
        int gear;

        @Override
        public void changeGear(int newGear) {
            gear = newGear;
        }

        @Override
        public void speedUp(int increment) {
            speed = speed + increment;
        }

        @Override
        public void applyBrakes(int decrement) {
            speed = speed - decrement;
        }

        public void print() {
            System.out.println("Speed: " + speed + ", Gear: " + gear);
        }
    }

    public static class Car implements Vehicle {
        int speed;
        int gear;

        @Override
        public void changeGear(int newGear) {
            gear = newGear;
        }

        @Override
        public void speedUp(int increment) {
            speed = speed + increment;
        }

        @Override
        public void applyBrakes(int decrement) {
            speed = speed - decrement;
        }

        public void print() {
            System.out.println("Speed: " + speed + ", Gear: " + gear);
        }
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.changeGear(2);
        bike.speedUp(3);
        bike.applyBrakes(1);

        System.out.println("Bicycle present state :");
        bike.print();

        Car car = new Car();
        car.changeGear(2);
        car.speedUp(3);
        car.applyBrakes(2);

        System.out.println("Car present state :");
        car.print();
    }
}
