/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01;

/**
 *
 * @author Cetecom
 */
public class Persona {
    //atributos 
    String rut;
    String nombre;
    int edad;
    String correo;
    
    //Metodo contructor con parametros
    public Persona(String rut, String nombre, int edad, String correo)
    {//this te esta diciendo de esta clase
        this.rut= rut;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }
    
    public void printPersona()
    {
        System.out.println("----informacion de persona-----");
        System.out.println("Rut es:"+rut);
        System.out.println("nombre es:"+nombre);
        System.out.println("edad es:"+edad);
        System.out.println("correo es"+correo);
    }
}
