package com.data_jpa.learn_hibernate.controller;

import com.data_jpa.learn_hibernate.entities.Product;
import com.data_jpa.learn_hibernate.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("products")
public class ProductController {
    private final ProductRepository productRepository;
    public static final Integer PAGE_SIZE = 5;

    @GetMapping
    public List<Product> getAllProducts(
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "0") Integer pageNumber
    )
    {
         return productRepository.findAll(Sort.by(Sort.Order.asc("quantity"),Sort.Order.desc("price")));
//       Pageable pageable = PageRequest.of(pageNumber,PAGE_SIZE,Sort.by(Sort.Direction.ASC,sortBy,"price"));
//       return productRepository.findAll(pageable).getContent();
//        Pageable pageable = PageRequest.of(pageNumber,PAGE_SIZE,Sort.by(Sort.Direction.ASC,sortBy,"price"));
//        return productRepository.findByTitleContainsIgnoreCase("a",pageable);

    }
}
