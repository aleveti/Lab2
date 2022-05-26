/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.valle.vista;
import co.edu.valle.controller.ProductsController;
import javax.swing.JOptionPane;

/**
 *
 * @author juanp
 */
public class Menu {
    
    public void menu (){
        
        ProductsController productController = new ProductsController();
        int salir = 0;
        while (salir == 0){
            int identificador = Integer.parseInt(JOptionPane.showInputDialog
                ("Oprima una opción de lo que deseas hacer: " 
                + "\n 1. Iniciar turno"
                + "\n 2. Gestionar productos"
                + "\n 3. Gestionar clientes"
                + "\n 4. Gestionar proveedores"
                + "\n 5. Registro de productos"
                + "\n 6. Atras"));
        
            if (identificador == 1){
                
            }
            if (identificador == 2){
                ProductsView menuProducto = new ProductsView(productController);
                menuProducto.dialogo();
            }
        }
        
    }    
    
    
    
    
    
}
