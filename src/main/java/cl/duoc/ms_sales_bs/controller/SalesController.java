package cl.duoc.ms_sales_bs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_sales_bs.model.dto.SalesDTO;
import cl.duoc.ms_sales_bs.service.SalesService;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/sales")
@Log4j2
public class SalesController {

    @Autowired
    SalesService saleService;

    @GetMapping("/{id}")
    public ResponseEntity<SalesDTO> findSalesById(@PathVariable("id") Long id) {
        SalesDTO salesDTO = saleService.findSalesById(id);
        return (salesDTO != null)?  new ResponseEntity<>(salesDTO, HttpStatus.OK) :
                                     new ResponseEntity<>(HttpStatus.NOT_FOUND); 
    }

    @PostMapping("")
    public ResponseEntity<SalesDTO> postMethodName(@RequestBody SalesDTO salesDTO) {
        //TODO: process POST request
        SalesDTO newSalesDTO = saleService.insertSale(salesDTO);
       return (newSalesDTO != null)?  new ResponseEntity<>(newSalesDTO, HttpStatus.OK) :
                                     new ResponseEntity<>(HttpStatus.NOT_FOUND); 
    }

}
