package com.company;

import java.util.ArrayList;
import java.util.List;

public class Admin {

    private String username = "alireza";
    private String password = "12345678";



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private static List products = new ArrayList<>();

    public static void addProduct(Object product){ products.add(product); }

    public static void removeProduct(Object product){
        products.remove(product);
    }

    public static List getProducts() {
        return products;
    }


}

