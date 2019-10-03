package com.debo.java.oops.inheritance.multilevelInheritance;

public class MultilevelInheritance {

    public static class One {
        public void print_geek() {
            System.out.println("Geeks");
        }
    }

    public static class Two extends One {
        public void print_for() {
            System.out.println("for");
        }
    }

    public static class Three extends Two {
        public void print_geek2() {
            System.out.println("Geeks");
        }
    }

    // Driver class
    public static void main(String[] args) {
        Three g = new Three();
        g.print_geek2();
        g.print_for();
        g.print_geek();
    }
}
