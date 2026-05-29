package com.sabor_express.service;

import com.sabor_express.model.Platillo;
import com.sabor_express.repository.PlatilloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatilloService {

    @Autowired
    private PlatilloRepository repository;

    public List<Platillo> listar() {
        return repository.findAll();
    }
}