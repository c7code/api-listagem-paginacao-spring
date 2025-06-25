package com.desafio.produtos.repository;

import com.desafio.produtos.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products,Long> {
}
