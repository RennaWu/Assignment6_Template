/*
 * SalesProfile class — represents a salesperson (employee)
 * ---------------------------------------------------------
 * Inherits from Person (gets 'name' field and methods)
 * Adds:
 *   - id        → unique employee ID
 *   - orders    → list of orders handled by this salesperson
 *
 * When a new order is assigned to a salesperson,
 * it should be added through addOrder().
 *
 * Author: Jiaen Xu
 */
package lab07.test;

import java.util.*;

public class SalesProfile extends Person {

    private String id;              // unique employee/salesperson ID
    private List<Order> orders;     // orders handled by this salesperson

    /**
     * Constructor: create a salesperson with a given ID and name
     * @param id   salesperson ID (e.g., "EMP-001")
     * @param name salesperson's name
     */
    public SalesProfile(String id, String name) {
        super(name,id);           // call Person(name)
        this.id = id;
        this.orders = new ArrayList<>();
    }

    // Getter and setter for ID
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Retrieve all orders this salesperson handled
    public List<Order> getOrders() {
        return orders;
    }

    // Link a new order to this salesperson
    public void addOrder(Order order) {
        orders.add(order);
    }


}
