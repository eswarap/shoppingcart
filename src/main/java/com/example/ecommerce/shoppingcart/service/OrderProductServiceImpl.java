package com.example.ecommerce.shoppingcart.service;

import com.example.ecommerce.shoppingcart.model.OrderProduct;
import com.example.ecommerce.shoppingcart.repository.OrderProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService {

    @Autowired
    private OrderProductRepository orderProductRepository;

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
    
}
