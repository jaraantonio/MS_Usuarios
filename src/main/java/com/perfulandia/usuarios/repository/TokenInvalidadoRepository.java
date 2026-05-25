package com.perfulandia.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perfulandia.usuarios.model.entity.TokenInvalidado;

public interface TokenInvalidadoRepository extends JpaRepository<TokenInvalidado, String> {
}