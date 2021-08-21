/*
Un socio con atributos:
número,
nombre,
apellido paterno,
apellido materno, 
correo.
Instancia 2 objetos y muestra la información.
 */
package proyecto02;

public class Socio {
    //atributos
    int numero;
    String nombre;
    String apellidoP;
    String apellidoM;
    String correo;
    
    //metodo constructor con parametro
    public Socio(
            int numero,
            String nombre,
            String apellidoP,
            String apellidoM,
            String correo)
    {
        this.numero = numero;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.correo = correo;
    }
    
    public void printSocio(){
        System.out.println("Información de socio");
        System.out.println("numero: "+numero);
        System.out.println("nombre: "+nombre);
        System.out.println("apellido paterno: "+apellidoP);
        System.out.println("apellido Materno: "+apellidoM);
        System.out.println("correo: "+correo);
    }
}

