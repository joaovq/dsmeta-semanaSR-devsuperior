package com.bloomin.dsmeta.service.impl;

import com.bloomin.dsmeta.entity.Sale;
import com.bloomin.dsmeta.repository.SaleRepository;
import com.bloomin.dsmeta.service.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements ISaleService {
    @Autowired
    private SaleRepository repository;

    @Override
    public List<Sale> getAll() {
        return repository.findAll();
    }

    @Override
    public Sale getSaleById(Long id) {
        if(repository.findById(id).isPresent())
            return repository.findById(id).get();

        return null;
    }

    @Override
    public void create(Sale sale) {
        repository.save(sale);
    }

    @Override
    public void update(Long id, Sale sale) {
        Sale sale1 = repository.findById(id).get();

        if(repository.findById(id).isPresent()){
            sale1.setName(sale.getName());
            sale1.setAmount(sale.getAmount());
            sale1.setDeals(sale.getDeals());
            sale1.setVisited(sale.getVisited());
            sale1.setDate(sale.getDate());
            repository.save(sale1);
        }


    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
