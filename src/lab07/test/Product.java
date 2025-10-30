/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jiaenxu
 */
public class Product {
    private String id;

    private String name;
    private double floorPrice;
    private double targetPrice;
    private double ceilingPrice;
    
    // Stores all OrderItems that include this product.
    List<OrderItem> orderitems;

    public Product(String name,String id, double floor, double target, double ceiling) {
        this.name = name;
        this.id = id;
        this.floorPrice = floor;
        this.targetPrice = target;
        this.ceilingPrice = ceiling;
        this.orderitems = new ArrayList<>();
        
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getFloorPrice() {
        return floorPrice;
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public double getCeilingPrice() {
        return ceilingPrice;
    }
}
