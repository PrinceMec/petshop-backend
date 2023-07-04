package com.petshop.petshopbackendproject.repository;


import com.petshop.petshopbackendproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);

    List<Product> findProductByProductId(long id);
}
