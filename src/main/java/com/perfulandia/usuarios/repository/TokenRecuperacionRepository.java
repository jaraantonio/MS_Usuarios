package com.perfulandia.usuarios.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perfulandia.usuarios.model.entity.TokenRecuperacion;

public interface TokenRecuperacionRepository extends JpaRepository<TokenRecuperacion, Integer> {
    Optional<TokenRecuperacion> findByToken(String token);
}