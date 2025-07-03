package com.xavier.e_commerce.service.impl;

import com.xavier.e_commerce.DTO.CreateProductDTO;
import com.xavier.e_commerce.entity.Product;
import com.xavier.e_commerce.repository.ProductsRepository;
import com.xavier.e_commerce.service.AddProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AddProductsServiceImpl implements AddProductsService {

    @Autowired
    private ProductsRepository repository;

    public AddProductsServiceImpl(ProductsRepository repository){
        this.repository = repository;
    }

    @Override
    public void addProduct(CreateProductDTO productDTO) {
        Product newProduct = new Product();

        newProduct.setCategory(productDTO.getCategory());
        newProduct.setName(productDTO.getName());
        newProduct.setStock(productDTO.getStock());
        newProduct.setValue(productDTO.getValue());
        newProduct.setDescription(newProduct.getDescription());
        newProduct.setUpdate(null);
        newProduct.setRegistrationDate(LocalDateTime.now());

        repository.save(newProduct);
    }
}
