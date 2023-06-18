package com.dinafinkel.javaeetest.bean;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Cart() {
    }

    public Cart(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
