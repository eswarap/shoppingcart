package com.example.ecommerce.shoppingcart.service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.example.ecommerce.shoppingcart.model.Product;

import org.springframework.validation.annotation.Validated;

@Validated
public interface ProductService {
    @NotNull Iterable<Product> getAllProducts();

    Product getProduct(@Min(value = 1L, message = "Invalid product ID.") long id);

    Product save(Product product);
}
