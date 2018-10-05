package com.company.java.model;

public class Shirt extends ClothingItem {

    private String pattern = "Not set";


    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Shirt(String size, double price) {
        super("Shirt", size, price); // I removed the type arg because I know that it is already a shirt
    }

}
