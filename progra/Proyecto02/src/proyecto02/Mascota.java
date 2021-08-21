/*
 Una mascota, 
agrega 5 atributos, 
crea 3 objetos y
arroja la información de cada uno de ellos.

 */
package proyecto02;

/**
 *
 * @author Alumno
 */
public class Mascota {
    String nombre;
    String direccion;
    int telefono;
    String animal;
    String estatura;
    
  
    public Mascota(
        String nombre,
        String direccion,
        int telefono,
        String animal,
        String estatura)
    {
        this.nombre =  nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.animal = animal;
        this.estatura = estatura;
    };
    
    public void printMascota()
    {
        System.out.println("---Informacion de la mascota");
        System.out.println("nombre: "+nombre);
        System.out.println("direccion: "+direccion);
        System.out.println("telefono: "+telefono);
        System.out.println("animal: "+animal);
        System.out.println("estatura: "+estatura);
    }
}
