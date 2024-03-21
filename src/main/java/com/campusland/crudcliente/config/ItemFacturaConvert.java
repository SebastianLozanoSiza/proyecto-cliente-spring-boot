package com.campusland.crudcliente.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.campusland.crudcliente.dto.ItemFacturaDTO;
import com.campusland.crudcliente.repositories.entities.ItemFactura;
import com.campusland.crudcliente.services.ProductoService;

public class ItemFacturaConvert {
    
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProductoService productoService;

    public ItemFacturaDTO convertToDto(ItemFactura itemFactura) {
        ItemFacturaDTO itemFacturaDTO = modelMapper.map(itemFactura, ItemFacturaDTO.class);
        itemFacturaDTO.setProductoId(itemFactura.getProducto().getId());
        return itemFacturaDTO;
    }

    public ItemFactura convertToEntity(ItemFacturaDTO itemFacturaDTO) {
        return modelMapper.map(itemFacturaDTO, ItemFactura.class);
    }
}
