package com.example.ecommerce.shoppingcart.repository;

import com.example.ecommerce.shoppingcart.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
}
