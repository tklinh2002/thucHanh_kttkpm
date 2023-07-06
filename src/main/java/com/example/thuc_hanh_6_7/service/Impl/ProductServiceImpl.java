package com.example.thuc_hanh_6_7.service.Impl;

import com.example.thuc_hanh_6_7.entitys.Product;
import com.example.thuc_hanh_6_7.repositories.ProductRepository;
import com.example.thuc_hanh_6_7.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public boolean save(Product product) {

       return productRepository.save(product)==null?false:true ;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
