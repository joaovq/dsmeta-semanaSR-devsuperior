package com.bloomin.dsmeta.service;

import com.bloomin.dsmeta.entity.Sale;

import java.util.List;

public interface ISaleService {

    List<Sale> getAll();

    Sale getSaleById(Long id);

    void create(Sale sale);

    void update(Long id, Sale sale);

    void delete(Long id);
}
