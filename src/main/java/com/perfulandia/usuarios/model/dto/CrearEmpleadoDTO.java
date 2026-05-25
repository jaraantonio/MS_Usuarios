package com.perfulandia.usuarios.model.dto;

import com.perfulandia.usuarios.model.enums.Rol;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CrearEmpleadoDTO(
    @NotBlank String nombre,
    @NotBlank @Email String correo,
    @NotNull Rol rol
) {}