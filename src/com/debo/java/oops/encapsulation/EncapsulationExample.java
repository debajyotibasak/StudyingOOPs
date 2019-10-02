package com.debo.java.oops.encapsulation;

public class EncapsulationExample {

    public static class Employee {
        private String name;
        private int salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Harish");
        e.setSalary(20000);

        System.out.println(e.name);
        System.out.println(e.salary + "");
    }
}
