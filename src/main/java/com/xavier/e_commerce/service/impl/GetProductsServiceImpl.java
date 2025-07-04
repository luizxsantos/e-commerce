package com.xavier.e_commerce.service.impl;

import com.xavier.e_commerce.entity.Category;
import com.xavier.e_commerce.entity.Product;
import com.xavier.e_commerce.repository.ProductsRepository;
import com.xavier.e_commerce.service.GetProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    public Optional<Product> getProductById(UUID id) {
        Optional<Product> productFound = repository.findById(id);

        if (productFound.isEmpty()){
            throw new RuntimeException("Product with id: " + id + " was not found");
        }else{
            return productFound;
        }
    }

    public List<Product> getProductsByCategory(Category category) {

        return repository.findAllByCategory(category);
    }

}
