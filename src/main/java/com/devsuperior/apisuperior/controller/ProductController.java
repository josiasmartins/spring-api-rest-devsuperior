package com.devsuperior.apisuperior.controller;

import com.devsuperior.apisuperior.entity.Department;
import com.devsuperior.apisuperior.entity.Product;
import com.devsuperior.apisuperior.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getObjeccts() {
//        Department d1 = new Department(1L, "Tech");
//        Department d2 = new Department(2l, "Pet");
//
//        Product p1 = new Product(1L, "Macbook Pro", 4000.0, d1);
//        Product p2 = new Product(1L, "PC Gamer", 5000.0, d1);
//        Product p3 = new Product(1L, "Pet House", 300.0, d2);

//        List<Product> list = Arrays.asList(p1, p2, p3);
        List<Product> list = this.productRepository.findAll();

        return list;
    }

}
