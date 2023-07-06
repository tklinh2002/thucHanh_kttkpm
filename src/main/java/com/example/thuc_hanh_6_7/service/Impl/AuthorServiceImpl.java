package com.example.thuc_hanh_6_7.service.Impl;

import com.example.thuc_hanh_6_7.entitys.Author;
import com.example.thuc_hanh_6_7.repositories.AuthorRepository;
import com.example.thuc_hanh_6_7.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }

    @Override
    public Author findAuthorById(Integer id) {
        return authorRepository.findAuthorById(id);
    }
}
