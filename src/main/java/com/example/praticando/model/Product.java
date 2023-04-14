package com.example.praticando.model;

public class Product {
    private String name;
    private Double price;
    private Integer code;


    public Product(String name, Double price, Integer code) {
        this.name = name;
        this.price = price;
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
