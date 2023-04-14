package com.example.praticando.service;

import com.example.praticando.model.Product;
import com.example.praticando.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository produtoRepository;

    public ProductService(ProductRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Double calculateProductPrice(String name, Double price, Integer code) {
        Product product = produtoRepository.createProduct(name, price, code);
        product.setPrice((product.getPrice() + product.getPrice() * 0.1));
        return product.getPrice();
    }
}
