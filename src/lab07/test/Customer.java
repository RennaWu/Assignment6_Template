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
public class Customer extends Person {
    private ArrayList<Order> orders;

    public Customer(String name,String id) {
        super(name,id);
        orders = new ArrayList<>();
    }

    public void addOrder(Order o) {
        orders.add(o);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
