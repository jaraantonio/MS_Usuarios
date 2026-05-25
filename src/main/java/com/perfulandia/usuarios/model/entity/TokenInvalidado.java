package com.perfulandia.usuarios.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tokens_invalidados")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TokenInvalidado {
    @Id
    @Column(length = 500)
    private String token;

    @Column(name = "fecha_invalidacion", nullable = false)
    private LocalDateTime fechaInvalidacion;
}