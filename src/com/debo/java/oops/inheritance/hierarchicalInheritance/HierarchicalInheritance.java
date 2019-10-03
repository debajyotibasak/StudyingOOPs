package com.debo.java.oops.inheritance.hierarchicalInheritance;

public class HierarchicalInheritance {

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

    public static class Three extends One {
        /*............*/
    }

    public static void main(String[] args) {
        Three g = new Three();
        g.print_geek();
        Two t = new Two();
        t.print_for();
        g.print_geek();
    }
}
