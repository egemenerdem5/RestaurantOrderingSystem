package com.restaurant.model;

public class Dessert extends MenuItem {

    private final boolean containsNuts;

    public Dessert(String id, String name, double price, boolean containsNuts) {
        super(id, name, price);
        this.containsNuts = containsNuts;
    }

    public boolean containsNuts() {
        return containsNuts;
    }

    @Override
    public String getCategory() {
        return "DESSERT";
    }
}

