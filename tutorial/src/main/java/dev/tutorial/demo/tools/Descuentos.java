package dev.tutorial.demo.tools;

import java.util.List;

import dev.tutorial.demo.dto.ProductoDTO;

public class Descuentos {
    
    public double calcularPrecioTotal(List<ProductoDTO> productos, double descuento, boolean esClienteFrecuente) {

        double precioSinDescuento = 0.0;
        for (ProductoDTO producto : productos) {
            precioSinDescuento += producto.getPrecio();
        }

        double precioConDescuento = precioSinDescuento;
        if (esClienteFrecuente) {
            precioConDescuento -= precioSinDescuento * descuento;
        } else {
            precioConDescuento -= precioSinDescuento * (descuento / 2);
        }

        double precioConIVA = precioConDescuento * 1.16; // Suponiendo un IVA del 16%
        return precioConIVA;

    }

}
