/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automotora;

/**
 *
 * @author Cetecom
 */
public class Auto {
    String marca;
    String modelo;
    int año;
    String color;
    int capacidadMotor;
    int precio;
    
    public Auto(
            String marca,
            String modelo,
            int año,
            String color,
            int capacidadMotor,
            int precio){
        this.marca = marca;
        this.modelo = modelo;
        this.año =  año;
        this.color = color;
        this.capacidadMotor =  capacidadMotor;
        this.precio =  precio;
    }
    
    public void Modificar ( int precio, String color, int año){
        this.precio = precio;
        this.color = color;
        this.año =  año;
        
        System.out.println("Modificacion de los datos del color, prcio y año");
        System.out.println("Precio: "+precio);
        System.out.println("color"+ color);
        System.out.println("año: "+año);
        
    }
    
    public void DetalleDEAuto(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("color"+ color);
        System.out.println("año: "+año);
        System.out.println("Capacidad de motor: "+capacidadMotor);
        System.out.println("Precio: "+precio);
    }
    
    
}
