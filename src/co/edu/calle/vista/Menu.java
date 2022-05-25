/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.calle.vista;
import javax.swing.JOptionPane;

/**
 *
 * @author juanp
 */
public class Menu {
    
    public void menu (){
        
        int salir = 0;
        while (salir == 0){
            int identificador = Integer.parseInt(JOptionPane.showInputDialog
                ("Oprima una opción de lo que deseas hacer: " 
                + "\n 1. Iniciar turno"
                + "\n 2. Gestionar productos"
                + "\n 3. Gestionar clientes"
                + "\n 4. Gestionar proveedores"
                + "\n 5. Registro de productos"));
        
            if (identificador == 1){
                
            }
        }
        
    }    
    
    
    
    
    
}
