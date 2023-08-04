package org.example.adapter;


import org.example.adapter.service.Restaurant;
import org.example.adapter.service.ShippingSystem;

public class AdapterResAndShip implements Restaurant {
    private ShippingSystem shippingSystem;

    public AdapterResAndShip(ShippingSystem shippingSystem) {
        this.shippingSystem = shippingSystem;
    }

    @Override
    public void sendShippingRequest(String destination, double weight) {
        shippingSystem.requestShipment(destination,weight);
    }
}
