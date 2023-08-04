package org.example.adapter.service.Impl;


import org.example.adapter.service.Restaurant;

public class RestaurantImpl implements Restaurant {
    @Override
    public void sendShippingRequest(String destination, double weight) {
        System.out.println("Order sent for delivery to: " + destination + ", Weight: " + weight + " kg");
    }
}
