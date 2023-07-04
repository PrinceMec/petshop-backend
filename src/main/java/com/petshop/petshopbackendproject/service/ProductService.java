package com.petshop.petshopbackendproject.service;



import com.petshop.petshopbackendproject.model.Product;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product);

    public List<Product> getAllProducts();

    public List<Product> findByCategory(String category);

    public Product getProductById(long id);
}
