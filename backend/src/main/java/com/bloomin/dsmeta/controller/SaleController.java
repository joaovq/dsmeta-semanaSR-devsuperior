package com.bloomin.dsmeta.controller;

import com.bloomin.dsmeta.entity.Sale;
import com.bloomin.dsmeta.service.impl.SaleServiceImpl;
import com.bloomin.dsmeta.service.impl.SmsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleServiceImpl service;
    @Autowired
    private SmsServiceImpl smsService;


//    Colocando os resultados em páginas
//    A requisição é feita por cada 20
//    Requisição no postman http://localhost:8080/sales/findSales?minDate=2021-11-21&maxDate=2022-05-04
    @GetMapping("/findSales")
    public Page<Sale> findSales(@RequestParam(value = "minDate", defaultValue = "") String minDate,
                                @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
                                Pageable pageable){
        return service.getAll(minDate, maxDate, pageable);
    }

    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long id){
        smsService.sendSms(id);
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
