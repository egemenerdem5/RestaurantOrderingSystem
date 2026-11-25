package com.restaurant.exception;

public class EmptyOrderException extends RestaurantException {

    public EmptyOrderException(String message) {
        super(message);
    }
}