/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.valle.modelos;

/**
 *
 * @author juanp
 */
public class ClientsSell {
    int id;
    Customers customer;
    Products [] products;

    public ClientsSell(int id, Customers customer, Products[] products) {
        this.id = id;
        this.customer = customer;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public Products[] getProducts() {
        return products;
    }

    public void setProducts(Products[] products) {
        this.products = products;
    }
}
