package com.macarenastore.macarenastorebackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double precio;

    private Long ean; // Cambiado a tipo Long para representar el EAN como número

    // Constructor predeterminado requerido por Hibernate
    public Producto() {
    }

    // Constructor personalizado
    public Producto(Long id, String name, double precio, Long ean) {
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.ean = ean;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Long getEan() {
        return ean;
    }

    public void setEan(Long ean) {
        this.ean = ean;
    }
}
