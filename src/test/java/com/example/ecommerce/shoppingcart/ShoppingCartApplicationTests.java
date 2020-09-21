package com.example.ecommerce.shoppingcart;


import com.example.ecommerce.shoppingcart.controller.OrderController;
import com.example.ecommerce.shoppingcart.controller.ProductController;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { ShoppingCartApplication.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ShoppingCartApplicationTests {

	@Autowired private ProductController productController;

	@Autowired private OrderController orderController;
	
	@Test
	void contextLoads() {
		Assertions
		.assertThat(productController)
		.isNotNull();
	  Assertions
		.assertThat(orderController)
		.isNotNull();
	}

}
