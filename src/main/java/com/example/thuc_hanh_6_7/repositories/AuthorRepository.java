package com.example.thuc_hanh_6_7.repositories;

import ch.qos.logback.core.model.INamedModel;
import com.example.thuc_hanh_6_7.entitys.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Author findAuthorById(Integer id);
}
