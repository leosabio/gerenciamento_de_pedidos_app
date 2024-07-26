package com.restaurante.gerenciamento_de_pedidos_app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "Pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp horario;

    @NotBlank
    @Column(nullable = false)
    private String nome;

    @Column
    private String descricao;

    @Column
    private String imagem;

    @Column
    private boolean entregue;

    // Getters and Setters
    // Consider using Lombok @Getter and @Setter to reduce boilerplate code
}
