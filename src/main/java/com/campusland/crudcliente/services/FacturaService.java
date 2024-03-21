package com.campusland.crudcliente.services;

import java.util.List;

import com.campusland.crudcliente.repositories.entities.Factura;

public interface FacturaService {
    
    Factura findFacturaById(Long id);

    List<Factura> findFacturaAll();

    Factura saveFactura(Factura factura);

    void deleteFacturaById(Long id);
}
