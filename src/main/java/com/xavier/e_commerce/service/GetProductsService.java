package com.xavier.e_commerce.service;

import com.xavier.e_commerce.entity.Category;
import com.xavier.e_commerce.entity.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GetProductsService {
    List<Product> getAllProducts();
//    Optional<Product> getProductById(UUID id);
//    List<Product> getProductsByCategory(Category category);

}
