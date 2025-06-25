package com.desafio.produtos.service;


import com.desafio.produtos.dto.ProductDTO;
import com.desafio.produtos.pagination.PageResponse;
import com.desafio.produtos.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

private final ProductRepository productRepository;

public PageResponse<ProductDTO> list (Pageable pageable) {

    Pageable page = PageRequest.of(pageable.getPageNumber(),
            Math.min (pageable.getPageSize(),100));

    return PageResponse.of(productRepository.findAll(page).map(ProductDTO::from));
}

}
