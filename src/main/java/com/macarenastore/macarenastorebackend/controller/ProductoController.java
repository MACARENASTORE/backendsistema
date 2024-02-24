package com.macarenastore.macarenastorebackend.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.macarenastore.macarenastorebackend.entity.Producto;
import com.macarenastore.macarenastorebackend.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Buscar producto por nombre
    @GetMapping("/nombre/{name}")
    public Optional<Producto> buscarPorNombre(@PathVariable String name) {
        return productoRepository.findByName(name);
    }

    // Buscar producto por ID
    @GetMapping("/{id}")
    public Optional<Producto> buscarPorId(@PathVariable Long id) {
        return productoRepository.findById(id);
    }

    // Buscar producto por EAN
    @GetMapping("/ean/{ean}")
    public Optional<Producto> buscarPorEan(@PathVariable Long ean) {
        return productoRepository.findByEan(ean);
    }
}
