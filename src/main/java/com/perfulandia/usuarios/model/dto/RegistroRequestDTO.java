package com.perfulandia.usuarios.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record RegistroRequestDTO(
    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 100, message = "El nombre no puede exceder los 100 caracteres")
    String nombre,

    @NotBlank(message = "El correo es obligatorio") 
    @Email(message = "Formato de correo invalido") 
    @Size(max = 100, message = "El correo no puede exceder los 100 caracteres")
    String correo,
    
    @NotBlank(message = "La contrasena es obligatoria") 
    @Pattern(
        regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,64}$", 
        message = "La contrasena debe tener entre 8 y 64 caracteres, y contener al menos una mayuscula, una minuscula y un numero"
    )
    String contrasena,

    @NotBlank(message = "La direccion de envio es obligatoria")
    @Size(max = 255, message = "La direccion no puede exceder los 255 caracteres")
    String direccion
) {}