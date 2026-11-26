package com.restaurant.model;

import com.restaurant.exception.InvalidInputException;

public class Drink extends MenuItem {

    private final int volumeMl;

    public Drink(String id, String name, double price, int volumeMl) {
        super(id, name, price);
        if (volumeMl <= 0) {
            throw new InvalidInputException("Drink volume must be greater than zero.");
        }
        this.volumeMl = volumeMl;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    @Override
    public String getCategory() {
        return "DRINK";
    }
}

