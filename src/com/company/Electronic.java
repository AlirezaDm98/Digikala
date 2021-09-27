package com.company;

public class Electronic extends Product {

    private String brand;

    public Electronic(Integer id ,String name, String description, Double price, Integer count, String brand) {
        super(id , name, description, price, count);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
