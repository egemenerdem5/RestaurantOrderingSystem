package com.restaurant.exception;

public class MenuItemNotFoundException extends RestaurantException {

    public MenuItemNotFoundException(String message) {
        super(message);
    }
}