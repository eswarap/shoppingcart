package com.example.ecommerce.shoppingcart.service;

import javax.validation.constraints.NotNull;

import com.example.ecommerce.shoppingcart.model.User;

import org.springframework.validation.annotation.Validated;

@Validated
public interface UserService {
    @NotNull Iterable<User> getAllUsers();
}
