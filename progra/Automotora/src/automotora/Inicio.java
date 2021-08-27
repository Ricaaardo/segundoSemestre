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
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Auto objeto1 =  new Auto("toyota", "asdf", 2021, "rojo", 500, 1000000);
                objeto1.DetalleDEAuto();
                objeto1.Modificar(5000000, "azul", 2016);
                objeto1.DetalleDEAuto();
    }
    
}
