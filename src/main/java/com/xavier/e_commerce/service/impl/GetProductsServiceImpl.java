package com.xavier.e_commerce.service.impl;

import com.xavier.e_commerce.entity.Product;
import com.xavier.e_commerce.repository.ProductsRepository;
import com.xavier.e_commerce.service.GetProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetProductsServiceImpl implements GetProductsService {

    @Autowired
    private ProductsRepository repository;

    public GetProductsServiceImpl(ProductsRepository repository){
        this.repository = repository;
    }

    public List<Product> getAllProducts(){
        return repository.findAll();
    }
}
