package com.xavier.e_commerce.service;

import com.xavier.e_commerce.DTO.CreateProductDTO;

import java.util.UUID;

public interface UpdateProductService {

    void updateProduct(UUID id, CreateProductDTO productDTO);

}
