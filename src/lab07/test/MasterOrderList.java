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
public class MasterOrderList {
    private ArrayList<Order> orders;

    public MasterOrderList() {
        orders = new ArrayList<>();
    }

    public Order createOrder(Customer c, String id) {
        Order o = new Order(id,c);
        orders.add(o);
        return o;
    }

    public OrderItem addOrderItem(Order order, Product p, int qty, double price) {
        OrderItem item = new OrderItem(p, qty, price);
        order.getOrderItems().add(item);
        return item;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
