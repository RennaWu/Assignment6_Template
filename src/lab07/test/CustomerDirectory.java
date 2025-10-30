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
public class CustomerDirectory {
    private ArrayList<Customer> customers;

    public CustomerDirectory() {
        customers = new ArrayList<>();
    }

    public Customer addCustomer(String name, String id) {
        Customer c = new Customer(name,id);
        customers.add(c);
        return c;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
