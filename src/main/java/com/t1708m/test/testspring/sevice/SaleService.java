package com.t1708m.test.testspring.sevice;

import com.t1708m.test.testspring.entity.Sale;
import com.t1708m.test.testspring.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
    @Autowired
    SaleRepository saleRepository;
    public Sale create(Sale sale) {
        return saleRepository.save(sale);
    }

    public Page<Sale> getList(int page, int limit) {
        return saleRepository.findAll(PageRequest.of(page - 1, limit));
    }
    public Sale getDetail(int id) {
        return saleRepository.findById(id).orElse(null);
    }
}
