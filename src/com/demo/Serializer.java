package com.demo;

import java.io.*;
import java.util.Scanner;

class Product implements Serializable {
    String name;
    String brand;
    double price;

    public Product(String name, String brand, double price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String toString(){
        return name + " " + brand + " " + price;
    }
}
public class Serializer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Name, Brand Name and Price: ");
        String name = scanner.next();
        String brand = scanner.next();
        double price = scanner.nextDouble();
        Product product = new Product(name, brand, price);
        System.out.println(product.toString());
        try {
            FileOutputStream outputStream = new FileOutputStream("product.txt", true);
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(product);
                objectOutputStream.flush();
                objectOutputStream.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
