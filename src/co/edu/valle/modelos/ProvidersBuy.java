/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.valle.modelos;

/**
 *
 * @author juanp
 */
public class ProvidersBuy {
    
    int id;
    Providers provider;
    Products [] products;

    public ProvidersBuy(int id, Providers provider, Products[] products) {
        this.id = id;
        this.provider = provider;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Providers getProvider() {
        return provider;
    }

    public void setProvider(Providers provider) {
        this.provider = provider;
    }

    public Products[] getProducts() {
        return products;
    }

    public void setProducts(Products[] products) {
        this.products = products;
    }
    
    
}
