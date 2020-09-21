package com.example.ecommerce.shoppingcart.repository;

import com.example.ecommerce.shoppingcart.model.OrderProduct;
import com.example.ecommerce.shoppingcart.model.OrderProductPK;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
    
}
