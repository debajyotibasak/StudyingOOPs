package com.debo.java.oops.polymorphism.overriding;

public class Access {

    public static class Parent {
        private void secretMethod() {
            System.out.println("Secret");
        }

        protected void protectedMethod() {
            System.out.println("Protected by Parent");
        }
    }

    public static class Children extends Parent {
        private void secretMethod() {
            System.out.println("Secret");
        }

        @Override
        public void protectedMethod() {
            System.out.println("Protected by Child");
        }
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.protectedMethod();

        Parent c = new Children();
        c.protectedMethod();
    }
}
