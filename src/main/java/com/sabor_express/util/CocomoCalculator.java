package com.sabor_express.util;

public class CocomoCalculator {

    public static void main(String[] args) {

        // KLOC = miles de líneas de código
        double kloc = 10;

        // FORMULAS COCOMO
        double esfuerzo = 2.4 * Math.pow(kloc, 1.05);
        double tiempo = 2.5 * Math.pow(esfuerzo, 0.38);
        double personas = esfuerzo / tiempo;

        // COSTO POR PERSONA/MES
        double salarioMensual = 800;

        // COSTO TOTAL
        double costoTotal = esfuerzo * salarioMensual;

        System.out.println("=== MODELO COCOMO ===");
        System.out.println("KLOC: " + kloc);
        System.out.println("Esfuerzo: " + esfuerzo + " PM");
        System.out.println("Tiempo: " + tiempo + " meses");
        System.out.println("Personas: " + personas);

        System.out.println("\n=== COSTO DEL PROYECTO ===");
        System.out.println("Salario mensual: $" + salarioMensual);
        System.out.println("Costo total: $" + costoTotal);
    }
}