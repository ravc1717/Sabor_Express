package com.sabor_express.config;

import com.sabor_express.model.Platillo;
import com.sabor_express.repository.PlatilloRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner init(PlatilloRepository repo) {

        return args -> {

            // BORRA TODOS LOS REGISTROS
            repo.deleteAll();

            // ===== DESAYUNOS =====
            repo.save(new Platillo(
                    null,
                    "Desayuno Chapín",
                    "Huevos, frijoles, pan y café caliente",
                    5.99,
                    "desayuno",
                    "desayuno1.jpg"
            ));

            repo.save(new Platillo(
                    null,
                    "Panqueques Especiales",
                    "Panqueques con miel y frutas frescas",
                    6.50,
                    "desayuno",
                    "desayuno2.jpg"
            ));

            repo.save(new Platillo(
                    null,
                    "Sándwich Matutino",
                    "Sándwich de jamón y queso",
                    4.99,
                    "desayuno",
                    "desayuno3.jpg"
            ));

            // ===== ALMUERZOS =====
            repo.save(new Platillo(
                    null,
                    "Carne Asada Premium",
                    "Carne asada acompañada de arroz y ensalada",
                    10.99,
                    "almuerzo",
                    "almuerzo1.jpg"
            ));

            repo.save(new Platillo(
                    null,
                    "Pescado Frito",
                    "Pescado crujiente con limón y arroz",
                    9.50,
                    "almuerzo",
                    "almuerzo2.jpg"
            ));

            repo.save(new Platillo(
                    null,
                    "Pollo Asado",
                    "Pollo frito acompañado de papas fritas",
                    6.99,
                    "almuerzo",
                    "almuerzo3.jpg"
            ));

            // ===== CENAS =====
            repo.save(new Platillo(
                    null,
                    "Ensalada Italiana",
                    "Ensalada fresca con queso y aderezo italiano",
                    10.99,
                    "cena",
                    "cena1.jpg"
            ));

            repo.save(new Platillo(
                    null,
                    "Sándwiches Italianos",
                    "Sándwich italiano con jamón y queso especial",
                    6.99,
                    "cena",
                    "cena2.jpg"
            ));

            repo.save(new Platillo(
                    null,
                    "Sopa de Pollo",
                    "Sopa caliente de pollo con vegetales frescos",
                    5.75,
                    "cena",
                    "cena3.jpg"
            ));

            System.out.println("DATOS CARGADOS CORRECTAMENTE");

        };
    }
}