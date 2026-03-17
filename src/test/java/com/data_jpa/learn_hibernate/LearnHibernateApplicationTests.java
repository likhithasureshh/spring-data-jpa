package com.data_jpa.learn_hibernate;

import com.data_jpa.learn_hibernate.entities.Product;
import com.data_jpa.learn_hibernate.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class LearnHibernateApplicationTests {

	@Autowired
	ProductRepository productRepository;
	@Test
	void contextLoads()
	{

	}

	@Test
	void testRepo()
	{
//		Optional<Product> product = productRepository.findBySku("SKU1001");
//		if(product.isPresent())
//		{
//			System.out.println(product);
//		}
//		List<Product> products = productRepository.findByCreatedAtAfter(LocalDate.of(2026,3,16) );
//		System.out.println(products);
//		List<Product> products = productRepository.findByPriceGreaterThanAndQuantityLessThan(1200.00,40);
//		System.out.println(products);
//		List<Product> products = productRepository.findByTitleContainsIgnoreCase("PHOne");
//		System.out.println(products);
		Optional<Product> product = productRepository.findBySku("SKU1001");
		System.out.println(product);
	}



}
