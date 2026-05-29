package com.sabor_express.controller;

import com.sabor_express.repository.PlatilloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlatilloController {

    @Autowired
    private PlatilloRepository platilloRepository;

    @GetMapping("/platillos")
    public String inicio(Model model) {

        model.addAttribute("platillos",
                platilloRepository.findAll());

        return "platillos";
    }
}