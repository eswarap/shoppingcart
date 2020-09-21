package com.example.ecommerce.shoppingcart.repository;

import com.example.ecommerce.shoppingcart.model.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
