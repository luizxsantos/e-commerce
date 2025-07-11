package com.xavier.e_commerce.repository;

import com.xavier.e_commerce.entity.Category;
import com.xavier.e_commerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductsRepository extends JpaRepository<Product, UUID> {
    List<Product> findAllByCategory(Category category);

}
