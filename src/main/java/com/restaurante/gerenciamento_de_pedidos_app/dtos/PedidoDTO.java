package com.restaurante.gerenciamento_de_pedidos_app.dtos;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class PedidoDTO {

    private Long id;
    private Timestamp horario;
    private String nome;
    private String descricao;
    private String imagem;
    private boolean entregue;

}
