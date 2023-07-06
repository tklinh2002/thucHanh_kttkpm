package com.example.thuc_hanh_6_7.controller;

import com.example.thuc_hanh_6_7.entitys.Author;
import com.example.thuc_hanh_6_7.entitys.Product;
import com.example.thuc_hanh_6_7.service.AuthorService;
import com.example.thuc_hanh_6_7.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;
    private AuthorService authorService;

    public ProductController(ProductService productService, AuthorService authorService) {
        this.productService = productService;
        this.authorService = authorService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Product product){
        if(authorService.findAuthorById(product.getAuthor().getId())==null){
            Author author = new Author();
            author.setName(product.getAuthor().getName());
            System.out.println(author.toString());
            authorService.save(author);
        }
        return productService.save(product)?ResponseEntity.ok(product):ResponseEntity.ok("Produce must unique");
    }
    @GetMapping("/findAll")
    public List<Product> findAllBy(){
        return productService.findAll();
    }
}
