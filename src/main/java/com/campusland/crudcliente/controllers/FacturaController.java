package com.campusland.crudcliente.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.campusland.crudcliente.repositories.entities.Factura;
import com.campusland.crudcliente.services.FacturaService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/factura")
@AllArgsConstructor
public class FacturaController {

    private FacturaService facturaService;

    @GetMapping("/{id}")
    public Factura findById(@PathVariable Long id) {
        return facturaService.findFacturaById(id);
    }

    @GetMapping("/")
    public List<Factura> findById() {
        return facturaService.findFacturaAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        facturaService.deleteFacturaById(id);
    }

    @PostMapping("/")
    public Factura save(@RequestBody Factura factura){
        return facturaService.saveFactura(factura);

    }



}
