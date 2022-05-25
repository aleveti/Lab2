/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.calle.vista;

import co.edu.valle.controller.ProductsController;
import javax.swing.JOptionPane;

/**
 *
 * @author juanp
 */
public class ProductsView {
    
    public void dialogo(){
        int identificador = Integer.parseInt(JOptionPane.showInputDialog
            ("Oprima una opción de lo que deseas hacer: " 
                + "\n 1. Crear producto"
                + "\n 2. Editar producto"
                + "\n 3. Eliminar producto"
                + "\n 4. Ver producto"
                + "\n 5. Atras"));
        Products(identificador);
    }
    public void Products(int crud){
        if(crud == 1){
            String name = JOptionPane.showInputDialog("Ingrese el nombre del producto");
            float price = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del producto"));
            ProductsController product = new ProductsController();
            product.create(name, price);
            JOptionPane.showMessageDialog(null, "Se ha creado el producto: \n" + name + " con el precio " + price);
            dialogo();
        }
        
        if(crud == 2){
            
        }
        
        if(crud == 3){
            
        }
        
        if(crud == 4){
            
        }
        else{
            
        }
    }
}
