package com.example.thuc_hanh_6_7.repositories;

import com.example.thuc_hanh_6_7.entitys.Author;
import com.example.thuc_hanh_6_7.entitys.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
