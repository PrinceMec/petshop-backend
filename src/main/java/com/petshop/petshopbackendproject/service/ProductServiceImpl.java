package com.petshop.petshopbackendproject.service;


import com.petshop.petshopbackendproject.model.Product;
import com.petshop.petshopbackendproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public Product getProductById(long id) {
        List<Product> products = productRepository.findProductByProductId(id);
        return products.get(0);
    }


}
