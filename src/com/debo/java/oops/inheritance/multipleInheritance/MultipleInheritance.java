package com.debo.java.oops.inheritance.multipleInheritance;

public class MultipleInheritance {

    interface one {
        public void print_geek();
    }

    interface two {
        public void print_for();
    }

    interface three extends one, two {
        public void print_geeks();
    }

    public static class Child implements three {

        @Override
        public void print_geek() {
            System.out.println("Geek");
        }

        @Override
        public void print_for() {
            System.out.println("For");
        }

        @Override
        public void print_geeks() {
            System.out.println("Geeks");
        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.print_geek();
        c.print_for();
        c.print_geeks();
    }
}
