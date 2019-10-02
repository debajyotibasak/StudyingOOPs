package com.debo.java.oops.polymorphism.overriding;

public class MultiLevelOverride {

    public static class GrandParent {
        public void meinKon() {
            System.out.println("GrandParent: Sabka Baap");
        }
    }

    public static class Parent extends GrandParent {
        @Override
        public void meinKon() {
            System.out.println("Parent: Mein apne bete ka Baap");
        }
    }

    public static class Child extends Parent {
        @Override
        public void meinKon() {
            System.out.println("Children: Sabse chota aur changa");
        }
    }

    public static void main(String[] args) {
        GrandParent g = new GrandParent();
        g.meinKon();

        GrandParent p = new Parent();
        p.meinKon();

        GrandParent c = new Child();
        c.meinKon();
    }
}
