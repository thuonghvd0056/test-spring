package com.t1708m.test.testspring.sevice;

import com.t1708m.test.testspring.entity.Product;
import com.t1708m.test.testspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product create(Product product) {
        return productRepository.save(product);
    }

    public Page<Product> getList(int page, int limit) {
        return productRepository.findAll(PageRequest.of(page - 1, limit));
    }
    public Product getDetail(int id) {
        return productRepository.findById(id).orElse(null);
    }
}
