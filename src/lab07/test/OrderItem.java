/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07.test;

/**
 *
 * @author jiaenxu
 */
public class OrderItem {
    private Product product;
    private int quantity;
    private double paidPricePerItem;

    public OrderItem(Product p, int qty, double paidPrice) {
        this.product = p;
        this.quantity = qty;
        this.paidPricePerItem = paidPrice;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPaidPricePerItem() {
        return paidPricePerItem;
    }

    public double getOrderItemTotal() {
        return quantity * paidPricePerItem;
    }
}
