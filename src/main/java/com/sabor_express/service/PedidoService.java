package com.sabor_express.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabor_express.model.Pedido;
import com.sabor_express.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public void guardarPedido(Pedido pedido) {

        pedidoRepository.save(pedido);

    }

}