package com.bloomin.dsmeta.service;

import com.bloomin.dsmeta.entity.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISaleService {

    Page<Sale> getAll(String minDate, String maxDate, Pageable pageable);


    Sale getSaleById(Long id);

    void create(Sale sale);

    void update(Long id, Sale sale);

    void delete(Long id);
}
