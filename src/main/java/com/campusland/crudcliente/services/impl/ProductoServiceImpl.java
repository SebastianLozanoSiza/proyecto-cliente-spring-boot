package com.campusland.crudcliente.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campusland.crudcliente.repositories.RepositoryProducto;
import com.campusland.crudcliente.repositories.entities.Producto;
import com.campusland.crudcliente.services.ProductoService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductoServiceImpl implements ProductoService{

    private RepositoryProducto repositoryProducto;

    @Override
    public List<Producto> findProductoByNombre(String term) {
        return repositoryProducto.findByNombre(term);
    }
    
}
