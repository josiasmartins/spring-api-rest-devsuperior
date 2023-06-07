package com.devsuperior.apisuperior.repository;

import com.devsuperior.apisuperior.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
