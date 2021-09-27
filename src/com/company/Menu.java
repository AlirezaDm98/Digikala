package com.company;

import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void soutShoes(){
        List<Shoes> shoes = Database.getShoes();

        System.out.println();
        System.out.println("*** SHOES ***");
        System.out.println();

        for (Shoes shoes1 : shoes) {
            System.out.println("Product id : " + shoes1.getId());
            System.out.println("Product name : " + shoes1.getName());
            System.out.println("Product desc : " + shoes1.getDescription());
            System.out.println("Product price : " + shoes1.getPrice());
            System.out.println("Product count : " + shoes1.getCount());
            System.out.println("Product size : " + shoes1.getSize());
            System.out.println("Product brand : " + shoes1.getBrand());
            System.out.println("Product color : " + shoes1.getColor());
            System.out.println("Product type : " + shoes1.getType());

            System.out.println("====================================");
        }
    }

    public static void soutElectronics(){
        List<Electronic> electronics = Database.getElectronics();

        System.out.println();
        System.out.println("*** ELECTRONIC PRODUCTS ***");
        System.out.println();

        for (Electronic electronic : electronics) {
            System.out.println("Product id : " + electronic.getId());
            System.out.println("Product name : " + electronic.getName());
            System.out.println("Product desc : " + electronic.getDescription());
            System.out.println("Product price : " + electronic.getPrice());
            System.out.println("Product count : " + electronic.getCount());
            System.out.println("Product brand : " + electronic.getBrand());

            System.out.println("====================================");
        }
    }

    public static void soutReadables(){
        List<Readable> readables = Database.getReadables();

        System.out.println();
        System.out.println("*** READABLE PRODUCTS ***");
        System.out.println();

        for (Readable readable : readables) {
            System.out.println("Product id : " + readable.getId());
            System.out.println("Product name : " + readable.getName());
            System.out.println("Product desc : " + readable.getDescription());
            System.out.println("Product price : " + readable.getPrice());
            System.out.println("Product count : " + readable.getCount());
            System.out.println("Product category : " + readable.getCategory());
            System.out.println("Product type : " + readable.getType());

            System.out.println("====================================");
        }
    }

    public static void productView(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : (1) Shoes , (2) Electronics , (3) Readables  , (4) Main menu: ");

        Integer inputNumber = scanner.nextInt();

        switch (inputNumber) {
            case 1 : soutShoes(); mainMenu(); break;
            case 2 : soutElectronics(); mainMenu(); break;
            case 3 : soutReadables(); mainMenu(); break;
            case 4 : mainMenu(); break;
        }

    }

    public static void addToCart(){

        List<Shoes> shoes = Database.getShoes();

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter Product ID : ");

        Integer id = scanner.nextInt();

        if (Cart.getProducts().size() < 6){
            for (Shoes shoes1 : shoes) {
                if (shoes1.getId() == id){
                    if (shoes1.getCount() == 0){
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
                }
                else {
                    System.out.println("Product Not Found");
                }
            }
        }
        mainMenu();
    }
    
    public static void showCart(){

        List products = Cart.getProducts();

        System.out.println();
        System.out.println("*** CART ***");
        System.out.println();

        Product product;
        for (Object shoes1 : products) {
            product = (Product) shoes1;
            System.out.println("Product id : " + product.getId());
            System.out.println("Product name : " + product.getName());
            System.out.println("===================================");
        }

        mainMenu();
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

    public static void addUpPrices(){

        List products = Cart.getProducts();

        Double sum = 0d;
        Product product;
        for (Object object : products) {
            product = (Product) object;
            sum += product.getPrice();
        }

        System.out.println("Sum of prices : " + sum);

    }

    public static void finalConfirmation(){

        addUpPrices();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Confirm and buy all the products : Y/N ");

        String confirmation = scanner.next();

        if (confirmation.equals("Y")){
            Cart.getProducts().clear();
            System.out.println("Tnx for shopping");
        } else {
            productView();
        }

        mainMenu();
    }


    public static void loginMenu(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME");
        System.out.println();

        System.out.print("(1) Login , (2) Register ,(3) Login admin : ");

        Integer input = scanner.nextInt();

        switch (input) {
            case 1 :
                SignInUp.login();
                mainMenu();
                break;
            case 2 :
                SignInUp.signUp();
                     loginMenu();
                     break;
            case 3 :
                SignInUp.Adminlogin();

                break;
        }
    }

    public static void mainMenu(){

        System.out.println("MAIN MENU");
        System.out.println();

        System.out.print("Enter any number :  (1) Show products , (2) Show Cart , (3) Add To cart , (4) remove from cart ,(5) confirmation , (6) login menu");

        Scanner scanner = new Scanner(System.in);

        Integer input = scanner.nextInt();

        switch (input) {
            case 1 :
                productView();
                break;
            case 2 :
                showCart();
                break;
            case 3 :
                addToCart();
                break;
            case 4 :
                removeFromCart();
                break;
            case 5 :
                finalConfirmation();
                break;
            case 6 :
                loginMenu();
                break;
        }
    }

}
