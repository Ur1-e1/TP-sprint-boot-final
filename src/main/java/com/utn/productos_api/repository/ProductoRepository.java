package com.utn.productos_api.repository;

import com.utn.productos_api.model.Categoria;
import com.utn.productos_api.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByCategoria(Categoria categoria);
}
