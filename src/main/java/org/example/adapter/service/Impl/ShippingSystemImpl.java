package org.example.adapter.service.Impl;


import org.example.adapter.service.ShippingSystem;

public class ShippingSystemImpl implements ShippingSystem {
    @Override
    public void requestShipment(String to, double weightKg) {
        System.out.println("Shipment requested to: " + to + ", Weight: " + weightKg + " kg");
    }
}
