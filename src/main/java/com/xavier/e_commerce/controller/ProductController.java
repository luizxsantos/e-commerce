package com.xavier.e_commerce.controller;

import com.xavier.e_commerce.DTO.CreateProductDTO;
import com.xavier.e_commerce.entity.Product;
import com.xavier.e_commerce.service.AddProductsService;
import com.xavier.e_commerce.service.GetProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    AddProductsService addProductService;

    @Autowired
    GetProductsService getProductsService;

    @PostMapping("")
    public String addProduct(@RequestBody CreateProductDTO product){
        addProductService.addProduct(product);
        return "Product succesfully added!";
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return getProductsService.getAllProducts();
    }


}
