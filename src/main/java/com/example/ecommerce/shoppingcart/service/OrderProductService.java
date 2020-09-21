package com.example.ecommerce.shoppingcart.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.example.ecommerce.shoppingcart.model.OrderProduct;

import org.springframework.validation.annotation.Validated;

@Validated
public interface OrderProductService {
    OrderProduct create(@NotNull(message = "The products for order cannot be null.") @Valid OrderProduct orderProduct);
}
