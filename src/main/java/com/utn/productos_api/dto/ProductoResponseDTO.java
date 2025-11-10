package com.utn.productos_api.dto;

import com.utn.productos_api.model.Categoria;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "DTO para la respuesta de un producto")
public class ProductoResponseDTO {

    @Schema(description = "ID del producto", example = "1")
    private Long id;

    @Schema(description = "Nombre del producto", example = "Laptop")
    private String nombre;

    @Schema(description = "Descripción del producto", example = "Laptop de 16GB RAM")
    private String descripcion;

    @Schema(description = "Precio del producto", example = "999.99")
    private Double precio;

    @Schema(description = "Stock del producto", example = "10")
    private Integer stock;

    @Schema(description = "Categoría del producto", example = "ELECTRONICA")
    private Categoria categoria;

}
