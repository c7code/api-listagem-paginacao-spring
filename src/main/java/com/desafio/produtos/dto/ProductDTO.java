package com.desafio.produtos.dto;

import com.desafio.produtos.model.Products;

import java.math.BigDecimal;

public record ProductDTO(
        String name,
        BigDecimal price
) {
    public static ProductDTO from (Products p){
        return new ProductDTO(p.getName(), p.getPrice());
    }
}
