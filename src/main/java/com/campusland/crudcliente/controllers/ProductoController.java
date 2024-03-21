package com.campusland.crudcliente.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusland.crudcliente.repositories.entities.Producto;
import com.campusland.crudcliente.services.ProductoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/productos")
@AllArgsConstructor
public class ProductoController {

    private ProductoService productoService;

    @GetMapping("/filtra-productos/{term}")
    public List<Producto> filtraProductos(@PathVariable String term){
        return productoService.findProductoByNombre(term);
    }
    
}
