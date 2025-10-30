/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07.test;

import java.util.ArrayList;

/**
 *
 * @author jiaenxu
 */
public class ProductCatalog {
    private ArrayList<Product> products;

    public ProductCatalog() {
        products = new ArrayList<>();
    }

    public Product addProduct(String name, String id,double floor, double target, double ceiling) {
        Product p = new Product(name, id, floor, target, ceiling);
        products.add(p);
        return p;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
