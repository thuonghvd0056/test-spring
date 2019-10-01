package com.t1708m.test.testspring.repository;

import com.t1708m.test.testspring.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Integer> {
}
