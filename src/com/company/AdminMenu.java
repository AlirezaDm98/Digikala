package com.company;

import java.util.List;
import java.util.Scanner;

public class AdminMenu {

    public static void addToCart() {

        List<Shoes> shoes = Database.getShoes();

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter Product ID : ");

        Integer id = scanner.nextInt();

        if (Cart.getProducts().size() < 6) {
            for (Shoes shoes1 : shoes) {
                if (shoes1.getId() == id) {
                    if (shoes1.getCount() == 0) {
                        System.out.println("Product Count Is 0");
                        System.out.println();
                        break;
                    } else {
                        shoes1.setCount(shoes1.getCount() - 1);
                        Cart.addProduct(shoes1);
                        System.out.println("Product Added Successfully");
                        System.out.println();
                        break;
                    }
                } else {
                    System.out.println("Product Not Found");
                }
            }
        }
    }

    public static void removeFromCart(){

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter Product Id : ");

        Integer id = scanner.nextInt();

        List products = Cart.getProducts();


        Product product;
        for (Object object : products){
            product = (Product) object;
            if (product.getId() == id){
                Cart.removeProduct(product);
                System.out.println("Product removed successfully");
                break;
            }
        }
        mainMenu();
    }

    public static void mainMenu(){

        System.out.println("MAIN MENU");
        System.out.println();

        System.out.print("Enter any number :  (1) Add To cart , (2) remove from cart ");

        Scanner scanner = new Scanner(System.in);

        Integer input = scanner.nextInt();

        switch (input) {

            case 1 :
                addToCart();
                break;
            case 2 :
                removeFromCart();
                break;

        }
    }
}
