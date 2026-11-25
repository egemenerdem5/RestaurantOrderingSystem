package com.restaurant.exception;

public class InvalidOrderStateException extends RestaurantException {

    public InvalidOrderStateException(String message) {
        super(message);
    }
}