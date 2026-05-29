package com.sabor_express.controller;

import com.sabor_express.model.Pedido;
import com.sabor_express.repository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/pedido/{platillo}")
    public String mostrarFormulario(@PathVariable String platillo,
                                    Model model) {

        Pedido pedido = new Pedido();

        pedido.setPlatillo(platillo);

        double precio = switch (platillo) {

            case "Desayuno Chapín" -> 5.99;
            case "Panqueques Especiales" -> 6.50;
            case "Pupusas" -> 4.99;

            case "Carne Asada" -> 8.99;
            case "Pescado Frito" -> 9.50;
            case "Pollo Frito" -> 7.99;

            case "Ensalada Italiana" -> 10.99;
            case "Sándwiches Italianos" -> 6.99;
            case "Sopa de Pollo" -> 5.75;

            default -> 0.0;
        };

        pedido.setPrecio(precio);

        pedido.setFecha(LocalDate.now());

        model.addAttribute("pedido", pedido);

        return "pedido";
    }

    @PostMapping("/guardar-pedido")
    public String guardarPedido(@ModelAttribute Pedido pedido) {

        Double total = pedido.getPrecio() * pedido.getCantidad();

        pedido.setTotal(total);

        pedido.setFecha(LocalDate.now());

        pedidoRepository.save(pedido);

        return "redirect:/platillos";
    }
}