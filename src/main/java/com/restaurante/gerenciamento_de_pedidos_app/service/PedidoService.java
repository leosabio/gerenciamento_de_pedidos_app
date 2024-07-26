package com.restaurante.gerenciamento_de_pedidos_app.service;

import com.restaurante.gerenciamento_de_pedidos_app.dtos.PedidoDTO;
import java.util.List;

public interface PedidoService {

    List<PedidoDTO> getAllPedidos();
    PedidoDTO getPedidoById(Long id);
    PedidoDTO createPedido(PedidoDTO pedidoDTO);
    PedidoDTO updatePedido(Long id, PedidoDTO pedidoDTO);
    void deletePedido(Long id);
    PedidoDTO updatePedidoStatus(Long id, boolean entregue);  // Add this method

}
