package com.xavier.e_commerce.controller;

import com.xavier.e_commerce.DTO.CreateProductDTO;
import com.xavier.e_commerce.entity.Category;
import com.xavier.e_commerce.entity.Product;
import com.xavier.e_commerce.service.AddProductsService;
import com.xavier.e_commerce.service.GetProductsService;
import com.xavier.e_commerce.service.UpdateProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    AddProductsService addProductService;

    @Autowired
    GetProductsService getProductsService;

    @Autowired
    UpdateProductService updateProductService;

    @PostMapping("")
    public String addProduct(@RequestBody CreateProductDTO product){
        addProductService.addProduct(product);
        return "Product succesfully added!";
    }

    @GetMapping("{id}")
    public Optional<Product> getProductById(@PathVariable UUID id){
        return getProductsService.getProductById(id);
    }

    @GetMapping("{category}")
    public List<Product> getProductsByCategory(@PathVariable Category category){
        return getProductsService.getProductsByCategory(category);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return getProductsService.getAllProducts();
    }

    @PutMapping("id")
    public String updateProduct(@PathVariable UUID id, @RequestBody CreateProductDTO productDTO){
        updateProductService.updateProduct(id, productDTO);
        return "Product was updated succesfully";
    }

}
