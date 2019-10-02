package com.debo.java.oops.polymorphism.overriding;

public class EmployeeExample {
    public static class Employee {
        int base = 10000;
        public int salary() {
            return base;
        }
    }

    public static class Clerk extends Employee {
        @Override
        public int salary() {
            return base + 10000;
        }
    }

    public static class Manager extends Employee {
        @Override
        public int salary() {
            return base + 20000;
        }
    }

    public static void main(String[] args) {
        Employee clerk = new Clerk();
        printSalary(clerk);

        Employee manager = new Manager();
        printSalary(manager);
    }

    private static void printSalary(Employee e){
        System.out.println(e.getClass().getSimpleName() + " " + e.salary());
    }
}
