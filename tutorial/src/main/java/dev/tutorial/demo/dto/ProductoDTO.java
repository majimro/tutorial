package dev.tutorial.demo.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProductoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nombre;
    private Double precio;
    private Integer stock;
    private String categoria;
    private Double descuento;

    public ProductoDTO(Long id, String nombre, Double precio, Integer stock, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.descuento = 0.0;
    }

}
