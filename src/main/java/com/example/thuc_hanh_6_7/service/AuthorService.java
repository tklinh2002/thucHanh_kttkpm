package com.example.thuc_hanh_6_7.service;

import com.example.thuc_hanh_6_7.entitys.Author;
import com.example.thuc_hanh_6_7.repositories.AuthorRepository;

public interface AuthorService {
    void save(Author author);
    Author findAuthorById(Integer id);

}
