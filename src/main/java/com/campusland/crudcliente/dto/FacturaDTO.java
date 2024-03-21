package com.campusland.crudcliente.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class FacturaDTO {
    
    private Long id;
    private String descripcion;
    private String observacion;
    private Date createAt;
    private List<ItemFacturaDTO> items;
    private Long clienteId;

}
