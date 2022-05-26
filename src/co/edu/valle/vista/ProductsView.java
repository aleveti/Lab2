/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.valle.vista;
import co.edu.valle.controller.ProductsController;
import java.util.Iterator;
import javax.swing.JOptionPane;
/**
 *
 * @author juanp
 */
public class ProductsView {
    
    ProductsController productController;

    public ProductsView(ProductsController productController) {
        this.productController = productController;
    }
    
    
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
            this.productController.create(name, price);
            JOptionPane.showMessageDialog(null, "Se ha creado el producto: \n" + name + " con el precio " + price);
            dialogo();
        }
        
        if(crud == 2){
            
        }
        
        if(crud == 3){
            
        }
        
        if(crud == 4){
            String products="";
            
            for (Iterator iterator = this.productController.all().iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                products += next.toString() + " ";
            }
            JOptionPane.showMessageDialog(null, products);
            dialogo();
        }
        else{
            
        }
    }
}
