/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobanco;

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
        Cuenta obj01 = new Cuenta(5211, "corriente", 50000);
        obj01.printInformacion();
        obj01.depositar(30000);
        obj01.printInformacion();
        obj01.giro(5000);
        obj01.printInformacion();
    }
    
}
