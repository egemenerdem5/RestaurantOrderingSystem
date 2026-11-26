package com.restaurant.model;

public class Food extends MenuItem {

    private final boolean vegetarian;

    public Food(String id, String name, double price, boolean vegetarian) {
        super(id, name, price);
        this.vegetarian = vegetarian;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public String getCategory() {
        return "FOOD";
    }
}

