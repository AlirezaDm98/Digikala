package com.company;

import jdk.nashorn.internal.ir.LexicalContext;
import jdk.nashorn.internal.ir.LexicalContextNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {

    private static List<Electronic> electronics = new ArrayList<>();
    private static List<Shoes> shoes = new ArrayList<>();
    private static List<Readable> readables = new ArrayList<>();
    private static LexicalContext.NodeIterator<LexicalContextNode> scanner;
    Scanner scanner = new Scanner(System.in);

    public static List<Shoes> getShoes() {
        Shoes shoe1 = new Shoes(1 , "name" , "desc" , 1d , 10 , 40 , "adidas" , "red" , "sneaker");
        shoes.add(shoe1);
        Shoes shoe2 = new Shoes(2 , "name" , "desc" , 1d , 10 , 40 , "adidas" , "red" , "sneaker");
        shoes.add(shoe2);
        Shoes shoe3 = new Shoes(3 , "name" , "desc" , 1d , 10 , 40 , "adidas" , "red" , "sneaker");
        shoes.add(shoe3);
        Shoes shoe4 = new Shoes(4 , "name" , "desc" , 1d , 10 , 40 , "adidas" , "red" , "sneaker");
        shoes.add(shoe4);
        Shoes shoe5 = new Shoes(5 , "name" , "desc" , 1d , 10 , 40 , "adidas" , "red" , "sneaker");
        shoes.add(shoe5);

        Shoes shoe6 = new Shoes();

        return shoes;
    }

    public static List<Readable> getReadables() {
        Readable readable1 = new Readable(1 , "name" , "desc" , 1d , 10 , "book" , "sci-fi");
        readables.add(readable1);
        Readable readable2 = new Readable(2 , "name" , "desc" , 1d , 10 , "book" , "sci-fi");
        readables.add(readable2);
        Readable readable3 = new Readable(3 , "name" , "desc" , 1d , 10 , "book" , "sci-fi");
        readables.add(readable3);
        Readable readable4 = new Readable(4 , "name" , "desc" , 1d , 10 , "book" , "sci-fi");
        readables.add(readable4);
        Readable readable5 = new Readable(5 , "name" , "desc" , 1d , 10 , "book" , "sci-fi");
        readables.add(readable5);

        return readables;
    }

    public static List<Electronic> getElectronics() {
        Electronic electronic1 = new Electronic(1 , "name" , "desc" , 1d , 10 , "brand");
        electronics.add(electronic1);
        Electronic electronic2 = new Electronic(2 ,"name" , "desc" , 1d , 10 , "brand");
        electronics.add(electronic2);
        Electronic electronic3 = new Electronic(3 ,"name" , "desc" , 1d , 10 , "brand");
        electronics.add(electronic3);
        Electronic electronic4 = new Electronic(4 ,"name" , "desc" , 1d , 10 , "brand");
        electronics.add(electronic4);
        Electronic electronic5 = new Electronic(5 ,"name" , "desc" , 1d , 10 , "brand");
        electronics.add(electronic5);

        return electronics;
    }
}
