package com.bloomin.dsmeta.controller;

import com.bloomin.dsmeta.entity.Sale;
import com.bloomin.dsmeta.service.impl.SaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleServiceImpl service;

    @GetMapping("/get_all")
    public List<Sale> getAll(){
        return service.getAll();

    }
    @GetMapping("/get_sale/{id}")
    public ResponseEntity<Sale> getSale(@PathVariable Long id){
        Sale saleById = service.getSaleById(id);
        return ResponseEntity.status(200).body(saleById) ;
    }

    @PostMapping("/post")
    public ResponseEntity<String> post(@RequestBody Sale sale){
        service.create(sale);
        String post= "post feito!";
        return ResponseEntity.status(201).body(post);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<String> put(@PathVariable Long id,@RequestBody Sale sale){
        service.update(id, sale);
        String update= "Update feito";
        return ResponseEntity.ok().body(update);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSale(@PathVariable Long id){
        service.delete(id);
    }
}
