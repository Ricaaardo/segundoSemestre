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
public class Celular {
    String modelo;
    String marca;
    String color;
    
    public Celular(String modelo, String marca, String color){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    };
    
    public void printCelular(){
        System.out.println("Informacion del celular");
        System.out.println("Modelo : "+modelo);
        System.out.println("marca: "+marca);
        System.out.println("color: "+color);
    }
    
}
