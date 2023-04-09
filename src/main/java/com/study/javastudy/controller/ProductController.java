package com.study.javastudy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.javastudy.model.Product;
import com.study.javastudy.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();     
    }

    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable Integer id){
        return productService.getById(id);
    }

    @PostMapping
    public Product add(@RequestBody Product product){
        return productService.add(product);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        productService.delete(id);
        return "Product with id:" + id + " was deleted!"; 
    }

    @PutMapping("/{id}")
    public Product update(@RequestBody Product product, @PathVariable Integer id){
        return productService.update(id, product);
    }

}
