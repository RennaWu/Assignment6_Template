/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07.test;

import java.util.*;

/**
 *
 * @author jiaenxu
 */
public class SupplierDirectory {
    private List<Supplier> suppliers = new ArrayList<>();

    public Supplier addSupplier(String name, String id) {
        Supplier s = new Supplier(name,id);
        suppliers.add(s);
        return s;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public boolean isEmpty() {
        return suppliers.isEmpty();
    }
}
