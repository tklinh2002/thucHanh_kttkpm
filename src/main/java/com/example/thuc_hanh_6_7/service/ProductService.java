package com.example.thuc_hanh_6_7.service;

import com.example.thuc_hanh_6_7.entitys.Product;

import java.util.List;

public interface ProductService {
    boolean save(Product product);
    List<Product> findAll();
}
