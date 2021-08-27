/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

/**
 *
 * @author Alumno
 */
public class Tienda {
    String rut;
    String nombre;
    String direccion;
    
    public Tienda(String rut, String nombre, String direccion){
        this.rut = rut;
        this.nombre = nombre;
        this. direccion = direccion;
    }
    
    
    public void printTienda(){
        System.out.println("informacion de la tienda");
        System.out.println("rut de tienda: "+rut);
        System.out.println("nombre: "+nombre);
        System.out.println("direccion: "+direccion);
    }
}
