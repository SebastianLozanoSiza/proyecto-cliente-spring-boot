package com.campusland.crudcliente.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ClienteDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private Date createAt;
}

