package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private static List products = new ArrayList<>();

    public static void addProduct(Object product){
        products.add(product);
    }
    
    public static void removeProduct(Object product){
        products.remove(product);
    }

    public static List getProducts() {
        return products;
    }
}
