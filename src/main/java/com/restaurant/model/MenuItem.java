package com.restaurant.model;

import com.restaurant.exception.InvalidInputException;
import java.util.Objects;

public abstract class MenuItem {

    private final String id;
    private final String name;
    private final double price;

    protected MenuItem(String id, String name, double price) {
        if (id == null || id.isBlank()) {
            throw new InvalidInputException("Menu item ID cannot be null or blank.");
        }
        if (name == null || name.isBlank()) {
            throw new InvalidInputException("Menu item name cannot be null or blank.");
        }
        if (price <= 0) {
            throw new InvalidInputException("Menu item price must be greater than zero.");
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getCategory();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem menuItem)) return false;
        return Objects.equals(id, menuItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}