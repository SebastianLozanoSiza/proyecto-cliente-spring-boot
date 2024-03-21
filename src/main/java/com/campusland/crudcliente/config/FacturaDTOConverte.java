package com.campusland.crudcliente.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.campusland.crudcliente.dto.FacturaDTO;
import com.campusland.crudcliente.repositories.entities.Factura;
import com.campusland.crudcliente.services.ClienteService;

@Component
public class FacturaDTOConverte {
    
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ClienteService clienteService;

    public FacturaDTO convertToDto(Factura factura) {
        FacturaDTO facturaDTO = modelMapper.map(factura, FacturaDTO.class);
        facturaDTO.setClienteId(factura.getCliente().getId());
        return facturaDTO;
    }

    public Factura convertToEntity(FacturaDTO facturaDTO) {
        Factura factura = modelMapper.map(facturaDTO, Factura.class);
        factura.setCliente(clienteService.findById(facturaDTO.getClienteId()));
        return factura;
    }
}
