package com.macarenastore.macarenastorebackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.macarenastore.macarenastorebackend.entity.Producto;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "producto", path="producto")
@CrossOrigin(origins = "http://localhost:3000")
public interface ProductoRepository extends CrudRepository<Producto, Long>{
    // Método para buscar por nombre y devolver un producto
    Optional<Producto> findByName(String name);
    
    // Método para buscar por ID y devolver un producto
    Optional<Producto> findById(Long id); // Cambia el tipo de dato a Long
    
    // Método para buscar por EAN y devolver un producto
    Optional<Producto> findByEan(Long ean); // Cambia el tipo de dato a Long
}
