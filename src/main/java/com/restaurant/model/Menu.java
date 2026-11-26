package com.restaurant.model;

import com.restaurant.exception.InvalidInputException;
import com.restaurant.exception.MenuItemNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Menu {

    private final Map<String, MenuItem> items = new LinkedHashMap<>();

    public void addItem(MenuItem item) {
        if (item == null) {
            throw new InvalidInputException("Menu item cannot be null.");
        }
        if (items.containsKey(item.getId())) {
            throw new InvalidInputException("Menu item with ID '" + item.getId() + "' already exists.");
        }
        items.put(item.getId(), item);
    }

    public void removeItem(String itemId) {
        if (itemId == null || itemId.isBlank()) {
            throw new InvalidInputException("Menu item ID cannot be null or blank.");
        }
        if (!items.containsKey(itemId)) {
            throw new MenuItemNotFoundException("Menu item not found with ID: " + itemId);
        }
        items.remove(itemId);
    }

    public MenuItem getItemById(String itemId) {
        if (itemId == null || itemId.isBlank()) {
            throw new InvalidInputException("Menu item ID cannot be null or blank.");
        }
        MenuItem item = items.get(itemId);
        if (item == null) {
            throw new MenuItemNotFoundException("Menu item not found with ID: " + itemId);
        }
        return item;
    }

    public List<MenuItem> getAllItems() {
        return Collections.unmodifiableList(new ArrayList<>(items.values()));
    }
}



