package com.xavier.e_commerce.service.impl;

import com.xavier.e_commerce.DTO.CreateProductDTO;
import com.xavier.e_commerce.entity.Product;
import com.xavier.e_commerce.repository.ProductsRepository;
import com.xavier.e_commerce.service.UpdateProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

public class UpdateProductServiceImpl implements UpdateProductService {

    @Autowired
    ProductsRepository repository;

    public UpdateProductServiceImpl(ProductsRepository repository){
        this.repository = repository;
    }

    public void updateProduct(UUID id, CreateProductDTO productDTO){
        Optional<Product> productFound = repository.findById(id);
        if(productFound.isEmpty()){
            throw new RuntimeException("It was not possible to find product with this id: " + id);
        }else{
            Product product = productFound.get();
            product.setName(productDTO.getName());
            product.setStock(productDTO.getStock());
            product.setCategory(productDTO.getCategory());
            product.setUpdate(LocalDateTime.now());
            product.setValue(productDTO.getValue());
            product.setDescription(productDTO.getDescription());

            repository.save(product);
        }

    }
}
