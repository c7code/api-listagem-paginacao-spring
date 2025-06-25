package com.desafio.produtos.controller;


import com.desafio.produtos.dto.ProductDTO;
import com.desafio.produtos.pagination.PageResponse;
import com.desafio.produtos.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/product")
@RequiredArgsConstructor
public class ProductController {

private final ProductService productService;


@GetMapping
public PageResponse<ProductDTO> list (Pageable page){
    return productService.list(page);
}


}
