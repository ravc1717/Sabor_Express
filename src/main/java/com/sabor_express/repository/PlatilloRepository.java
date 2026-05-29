package com.sabor_express.repository;

import com.sabor_express.model.Platillo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatilloRepository extends JpaRepository<Platillo, Long> {
}