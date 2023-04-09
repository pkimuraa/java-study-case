package com.study.javastudy.repository;


import com.study.javastudy.model.Product;
import com.study.javastudy.model.exception.ResourceNotFoundException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private List<Product> products = new ArrayList<Product>();
    private Integer lastId = 0;

    /**
     * Method to return products list
     * @return products list
    */
    public List<Product> getAll(){
        return products;
    }

    /**
     * Method to get Product by ID 
     * @param id from product
     * @return product by ID
    */
    public Optional<Product> getById(Integer id){
        return products
                .stream()
                .filter(product -> product.getId() == id)
                .findFirst();
    }

    /**
     * Method to add new product to product
     * @param product will be added
     * @return Returns product added into list
     */
    public Product add(Product product){ 
        lastId ++;

        product.setId(lastId);
        products.add(product);
        
        return product;
    }

    /**
     * Method to delete product by id
     * @param id 
     */
    public void delete(Integer id){
        products.removeIf(product -> product.getId() == id);
    }

    /**
     * Method to update product
     * @param product
     * @return updated product
     */
    public Product update(Product product){
        //zero: find product by id
        Optional<Product> foundProduct = getById(product.getId());

        if(foundProduct.isEmpty()){
            throw new ResourceNotFoundException("Product not Found");
        }
        //first: remove old product
        delete(product.getId());

        //then: add the new product
        products.add(product);

        return product;
    }
} 