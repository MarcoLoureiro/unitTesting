package com.example.praticando.repository;

import com.example.praticando.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    public Product createProduct(String name,Double price, Integer code){
        return new Product(name,price,code);
    }
}
