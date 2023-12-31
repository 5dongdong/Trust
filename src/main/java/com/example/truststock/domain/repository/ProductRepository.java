package com.example.truststock.domain.repository;

import com.example.truststock.domain.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
