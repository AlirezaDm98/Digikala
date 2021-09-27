package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SignInUp {

    static Scanner scanner = new Scanner(System.in);

    static Map<String , String> userDatabase = new HashMap<>();

    public static void signUp(){
        System.out.println(" *** SIGN UP ***");

        User user = new User();
        System.out.print("username : ");
        user.setUsername(scanner.next());
        System.out.print("password : ");
        user.setPassword(scanner.next());
        System.out.print("firstname : ");
        user.setFirstname(scanner.next());
        System.out.print("lastname : ");
        user.setLastname(scanner.next());
        System.out.print("phone number : ");
        user.setPhoneNo(scanner.next());
        System.out.print("email : ");
        user.setEmail(scanner.next());

        Address address = new Address();
        System.out.print("state : ");
        address.setState(scanner.next());
        System.out.print("city : ");
        address.setCity(scanner.next());
        System.out.print("avenue : ");
        address.setAvenue(scanner.next());
        System.out.print("postal code : ");
        address.setPostalCode(scanner.next());

        user.setAddress(address);

        userDatabase.put(user.getUsername() , user.getPassword());

        System.out.println("Registration successful");
    }
    public static void Adminlogin(){
        Admin admin = new Admin();

        System.out.print("Enter Your username : ");
        String username = scanner.next();
        System.out.print("Enter Your password : ");
        String password = scanner.next();


        if ( username.equals(admin.getPassword())){
            if(password.equals(admin.getPassword())){

            }
        }

    }

    public static void login(){
        System.out.println(" *** SIGN IN ***");

        System.out.print("Enter Your username : ");
        String username = scanner.next();
        System.out.print("Enter Your password : ");
        String password = scanner.next();

        if (userDatabase.containsKey(username)){
            if (userDatabase.get(username).equals(password)){
                System.out.println("Login successful");
            } else
                System.out.println("Login failed");
        }
    }

}
