package com.restaurant.exception;

public class PaymentFailedException extends RestaurantException {

    public PaymentFailedException(String message) {
        super(message);
    }
}