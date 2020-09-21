package com.example.ecommerce.shoppingcart.repository;

import com.example.ecommerce.shoppingcart.model.Order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
    
}
