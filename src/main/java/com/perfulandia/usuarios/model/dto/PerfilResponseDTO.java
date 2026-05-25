package com.perfulandia.usuarios.model.dto;

import com.perfulandia.usuarios.model.enums.Rol;

public record PerfilResponseDTO(
    Integer idUsuario, 
    String nombre, 
    String correo, 
    Rol rol,
    String direccion, 
    String datosPagoOfuscados 
) {}