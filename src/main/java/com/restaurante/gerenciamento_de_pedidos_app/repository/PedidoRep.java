package com.restaurante.gerenciamento_de_pedidos_app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.restaurante.gerenciamento_de_pedidos_app.model.Pedido;

public interface PedidoRep extends JpaRepository<Pedido, Long> {
}
