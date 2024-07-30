package com.restaurante.gerenciamento_de_pedidos_app.service;

import com.restaurante.gerenciamento_de_pedidos_app.dtos.PedidoDTO;
import com.restaurante.gerenciamento_de_pedidos_app.model.Pedido;
import com.restaurante.gerenciamento_de_pedidos_app.repository.PedidoRep;
import com.restaurante.gerenciamento_de_pedidos_app.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class impl implements PedidoService {

    @Autowired
    private PedidoRep pedidoRep;

    @Override
    public List<PedidoDTO> getAllPedidos() {
        return pedidoRep.findAll().stream()
                .map(pedido -> PedidoDTO.builder()
                        .id(pedido.getId())
                        .horario(pedido.getHorario())
                        .nome(pedido.getNome())
                        .descricao(pedido.getDescricao())
                        .imagem(pedido.getImagem())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public PedidoDTO getPedidoById(Long id) {
        Pedido pedido = pedidoRep.findById(id).orElseThrow(() -> new RuntimeException("Pedido not found"));
        return PedidoDTO.builder()
                .id(pedido.getId())
                .horario(pedido.getHorario())
                .nome(pedido.getNome())
                .descricao(pedido.getDescricao())
                .imagem(pedido.getImagem())
                .build();
    }

    @Override
    public PedidoDTO createPedido(PedidoDTO pedidoDTO) {
        Pedido pedido = new Pedido();
        pedido.setNome(pedidoDTO.getNome());
        pedido.setDescricao(pedidoDTO.getDescricao());
        pedido.setImagem(pedidoDTO.getImagem());
        pedido = pedidoRep.save(pedido);
        return PedidoDTO.builder()
                .id(pedido.getId())
                .horario(pedido.getHorario())
                .nome(pedido.getNome())
                .descricao(pedido.getDescricao())
                .imagem(pedido.getImagem())
                .build();
    }

    @Override
    public PedidoDTO updatePedido(Long id, PedidoDTO pedidoDTO) {
        Pedido pedido = pedidoRep.findById(id).orElseThrow(() -> new RuntimeException("Pedido not found"));
        pedido.setNome(pedidoDTO.getNome());
        pedido.setDescricao(pedidoDTO.getDescricao());
        pedido.setImagem(pedidoDTO.getImagem());
        pedido = pedidoRep.save(pedido);
        return PedidoDTO.builder()
                .id(pedido.getId())
                .horario(pedido.getHorario())
                .nome(pedido.getNome())
                .descricao(pedido.getDescricao())
                .imagem(pedido.getImagem())
                .build();
    }

    @Override
    public void deletePedido(Long id) {
        pedidoRep.deleteById(id);
    }
}

