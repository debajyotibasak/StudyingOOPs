package com.debo.java.oops.inheritance;

public class InheritanceExample {

    public static class MobilePhone {

        int price;
        String color;
        String company;

        public MobilePhone(int price, String color, String company) {
            this.price = price;
            this.color = color;
            this.company = company;
        }

        public String printDetails() {
            return "Price: " + price + " Color: " + color + " Company: " + company;
        }
    }

    public static class Samsung extends MobilePhone {

        String feature;

        public Samsung(int price, String color, String company, String feature) {
            super(price, color, company);
            this.feature = feature;
        }

        @Override
        public String printDetails() {
            return super.printDetails() + " Feature: " + feature;
        }
    }

    public static void main(String[] args) {
        Samsung s = new Samsung(20000, "Blue", "Samsung", "Touch");
        System.out.println(s.printDetails());
    }
}
