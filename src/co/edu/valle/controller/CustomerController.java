/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.valle.controller;

import co.edu.valle.modelos.Customers;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author juanp
 */
public class CustomerController {
    List<Customers> customers;

    public CustomerController() {
        this.customers = new ArrayList<>();
    }
    
    
    public Customers create(int id, String name){
        Customers customer = new Customers(id, name);
        this.customers.add(customer);
        return customer;
    }
    
    public Customers update(int id, String name){        
        Customers result = this.customers.stream().filter(customer -> 
                customer.getId() == id).collect(Collectors.toList()).get(0);
        if (result == null){
            return null;
        }
        result.setName(name);
        return result;
    }
    
    public Boolean delete (int id, String name){
        Customers result = this.customers.stream().filter(customer -> 
                customer.getId() == id).collect(Collectors.toList()).get(0);
        if (result == null){
            return null;
        }
        return this.customers.remove(result);
    }
    
    public List<Customers> all (){
        return this.customers;
    }
}
