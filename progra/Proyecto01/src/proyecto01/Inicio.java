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
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciamos objetos de personas
    
        Persona objeto1 = new Persona("20.123","juana",19,"juana@gmail.com");
        objeto1.printPersona();
        
        Persona objeto2 = new Persona("14.231", "maria", 17,"maria@duocuc.cl");
        objeto2.printPersona();
    }
    
}
