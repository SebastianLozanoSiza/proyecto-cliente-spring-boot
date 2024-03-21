package com.campusland.crudcliente.services;

import java.util.List;

import com.campusland.crudcliente.repositories.entities.Producto;

public interface ProductoService {
    
    List<Producto> findProductoByNombre(String term);

}
