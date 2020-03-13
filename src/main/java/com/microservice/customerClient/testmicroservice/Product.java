package com.microservice.customerClient.testmicroservice;

public class Product {

    String id;
    String name;

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
