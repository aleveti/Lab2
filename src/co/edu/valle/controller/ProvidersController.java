/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.valle.controller;

import co.edu.valle.modelos.Providers;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author juanp
 */
public class ProvidersController {
    
    List<Providers> providers;

    public ProvidersController() {
        this.providers = new ArrayList<>();
    }    
    
    public Providers create(int id, String name){
        Providers customer = new Providers(id, name);
        this.providers.add(customer);
        return customer;
    }
    
    public Providers update(int id, String name){        
        Providers result = this.providers.stream().filter(provider -> 
                provider.getId() == id).collect(Collectors.toList()).get(0);
        if (result == null){
            return null;
        }
        result.setName(name);
        return result;
    }
    
    public Boolean delete (int id, String name){
        Providers result = this.providers.stream().filter(provider -> 
                provider.getId() == id).collect(Collectors.toList()).get(0);
        if (result == null){
            return null;
        }
        return this.providers.remove(result);
    }
    
    public List<Providers> all (){
        return this.providers;
    }
    
}
