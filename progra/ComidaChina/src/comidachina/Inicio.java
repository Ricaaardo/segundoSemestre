/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comidachina;

/**
 *
 * @author Cetecom
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sandwich objeto1 = new Sandwich("carne, lechuga, tomate", "marraqueta", 100, "tradicional", 2, 2000);
        objeto1.detalleDeVenta();
        objeto1.TotalPrecio();
        objeto1.DescuentoMitadPRecio();
        
        Sandwich objeto2 = new Sandwich("salame, queso, lechuga, tomate", "frica", 500, "tradicional", 4, 1500);
        objeto2.detalleDeVenta();
        objeto2.TotalPrecio();
        objeto2.DescuentoMitadPRecio();
        
        
    }
    
}
