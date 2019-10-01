package com.t1708m.test.testspring.repository;

import com.t1708m.test.testspring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
