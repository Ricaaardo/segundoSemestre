/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comidachina;

/**
 *
 * @author Cetecom
 */
public class Sandwich {
    private String ingredientes;
    private String tipoPan;
    private double pesoGramos;
    private String nombre;
    private int cantidad;
    private int precio;
    
    public Sandwich(
        String ingredientes,
        String tipoPan,
        double pesoGramos,
        String nombre,
        int cantidad,
        int precio )
    {
        this.ingredientes =  ingredientes;
        this.tipoPan =  tipoPan;
        this.pesoGramos =  pesoGramos;
        this.nombre =  nombre;
        this.cantidad =  cantidad;
        this.precio =  precio; 
    }
    
    //metodo personalizados
    public void DescuentoMitadPRecio(){
        int total;
        total = (precio*cantidad)/2;
        System.out.println("mitad  del precio: "+total);
        
    }
    
    public void TotalPrecio(){
    int total;
    total  = cantidad*precio;
    System.out.println("Total sin descuento: "+total);
    }
    
    public void detalleDeVenta(){
    System.out.println("DETALLE DE VENTA");
    System.out.println("Nombre: "+nombre);
    System.out.println("Ingredientes: "+ ingredientes);
    System.out.println("Tipo de pan : "+tipoPan);
    System.out.println("Peso: "+pesoGramos);
    System.out.println("Precio : "+precio);
    System.out.println("Cantidad: "+cantidad);
    }
}
