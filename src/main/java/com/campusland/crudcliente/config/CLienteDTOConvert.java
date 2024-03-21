package com.campusland.crudcliente.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.campusland.crudcliente.dto.ClienteDTO;
import com.campusland.crudcliente.repositories.entities.Cliente;

@Component
public class CLienteDTOConvert {
    
@Autowired
    private ModelMapper modelMapper;

    public ClienteDTO convertToDto(Cliente cliente) {
        return modelMapper.map(cliente, ClienteDTO.class);
    }

    public Cliente convertToEntity(ClienteDTO clienteDTO) {
        return modelMapper.map(clienteDTO, Cliente.class);
    }

}
