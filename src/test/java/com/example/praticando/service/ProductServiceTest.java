package com.example.praticando.service;

import com.example.praticando.model.Product;
import com.example.praticando.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @InjectMocks
    ProductService productService;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void init() {
        productRepository = Mockito.mock(ProductRepository.class);
        productService = new ProductService(productRepository);
    }

    @Test
    @DisplayName("Calculating the product price using ProductRepository mocked class")
    public void testCalculateProductPrice() {

        String name = "Test";
        Double price = 200d;
        Integer code = 123;

        Mockito.when(productRepository.createProduct(name, price, code)).thenReturn(new Product(name, price, code));
        Double resultPrice = productService.calculateProductPrice(name, price, code);

        assertEquals(220, resultPrice);
        Mockito.verify(productRepository, Mockito.times(1)).createProduct(name,price,code);
    }

}