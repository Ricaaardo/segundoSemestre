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
public class Cuenta {
    private int numero;
    private String tipo;
    private int saldo;
    
    
    public Cuenta(int numero, String tipo, int saldo)
    {
        this.numero = numero;
        this.tipo =  tipo;
        this.saldo = saldo;
    }
    
    public void depositar(int dinero)
    {
        saldo = saldo+dinero;
    }
    
    public void giro(int dinero)
    {
        saldo = saldo - dinero;
    }
    public void printInformacion()
    {
        System.out.println("--informacion de la cuenta--");
        System.out.println("numero de la cuenta: "+numero);
        System.out.println("tipo: "+tipo);
        System.out.println("saldo: "+saldo);
        
    }
}
