package com.campusland.crudcliente.dto;

import lombok.Data;

@Data
public class ItemFacturaDTO {
    
    private Long id;
    private Integer cantidad;
    private Long productoId;
}
