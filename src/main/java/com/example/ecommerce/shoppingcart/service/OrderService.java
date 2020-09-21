package com.example.ecommerce.shoppingcart.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.example.ecommerce.shoppingcart.model.Order;

import org.springframework.validation.annotation.Validated;

@Validated
public interface OrderService {
    @NotNull Iterable<Order> getAllOrders();

    Order create(@NotNull(message = "The order cannot be null.") @Valid Order order);

    void update(@NotNull(message = "The order cannot be null.") @Valid Order order);
}
