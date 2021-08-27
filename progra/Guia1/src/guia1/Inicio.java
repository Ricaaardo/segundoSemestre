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
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente objt1 =  new Cliente("204474568", "juanito", "perez");
        objt1.printCliente();
        Celular objeto1 = new Celular("Y8S", "huawei", "verde");
        objeto1.printCelular();
        Tienda objeto01 =  new Tienda ("12345", "ripley", "calle 123");
        objeto01.printTienda();
    }
    
}
