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
public class Cliente {
    String rut;
    String nombre;
    String apellido;
    
    public Cliente(String rut, String nombre, String apellido)
    { //metodo contructor con parametro
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
    };
    
    public void printCliente(){
        System.out.println("informacion del cliente:");
        System.out.println("rut cliente: "+rut);
        System.out.println("nombre: "+nombre);
        System.out.println("apellido: "+apellido);
    };
}

