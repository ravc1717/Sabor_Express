package com.sabor_express.repository;

import com.sabor_express.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository
        extends JpaRepository<Pedido, Long> {
}