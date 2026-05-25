package com.perfulandia.usuarios.controller;

import com.perfulandia.usuarios.model.dto.PerfilResponseDTO;
import com.perfulandia.usuarios.model.dto.RegistroRequestDTO;
import com.perfulandia.usuarios.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping("/registro")
    public ResponseEntity<PerfilResponseDTO> registrar(@Valid @RequestBody RegistroRequestDTO dto) {
        PerfilResponseDTO respuesta = service.registrarCliente(dto);
        return new ResponseEntity<>(respuesta, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> credenciales) {
        String token = service.iniciarSesion(credenciales.get("correo"), credenciales.get("contrasena"));
        return ResponseEntity.ok(Map.of("token", token));
    }
}