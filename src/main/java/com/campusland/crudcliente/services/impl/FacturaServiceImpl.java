package com.campusland.crudcliente.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.campusland.crudcliente.repositories.RepositoryFactura;
import com.campusland.crudcliente.repositories.entities.Factura;
import com.campusland.crudcliente.services.FacturaService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FacturaServiceImpl implements FacturaService{

    private RepositoryFactura repositoryFactura;

    @Override
    @Transactional(readOnly = true)
    public Factura findFacturaById(Long id) {
        return repositoryFactura.findById(id).orElse(null);
    }

    @Override
    public List<Factura> findFacturaAll() {
        return (List<Factura>) repositoryFactura.findAll();
    }

    @Override
    @Transactional
    public Factura saveFactura(Factura factura) {
        return repositoryFactura.save(factura);
    }

    @Override
    @Transactional
    public void deleteFacturaById(Long id) {
        repositoryFactura.deleteById(id);
    }
    
}
