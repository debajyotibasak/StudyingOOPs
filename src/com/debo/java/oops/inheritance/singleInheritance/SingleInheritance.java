package com.debo.java.oops.inheritance.singleInheritance;

public class SingleInheritance {

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

    // Driver class
    public static void main(String[] args) {
        Two g = new Two();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
