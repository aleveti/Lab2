/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.valle.controller;

import co.edu.valle.modelos.Products;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author juanp
 */
public class ProductsController {
    
     List<Products> products;

    public ProductsController() {
        this.products = new ArrayList<>();
    }    
    
    public Products create(String name, float price){
        int id = Integer.parseInt((products.get(products.size()-1)))+1;
        Products product = new Products(id, name, price);
        this.products.add(product);
        return product;
    }
    
    public Products update(int id, String name, float price){        
        Products result = this.products.stream().filter(product -> 
                product.getId() == id).collect(Collectors.toList()).get(0);
        if (result == null){
            return null;
        }
        result.setName(name);
        result.setPrice(price);
        return result;
    }
    
    public Boolean delete (int id, String name){
        Products result = this.products.stream().filter(product -> 
                product.getId() == id).collect(Collectors.toList()).get(0);
        if (result == null){
            return null;
        }
        return this.products.remove(result);
    }
    
    public List<Products> all (){
        return this.products;
    }    
}
