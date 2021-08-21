/*

Un socio con atributos: número, nombre, apellido paterno, apellido materno, correo. 
Instancia 2 objetos y muestra la información.
Una mascota, agrega 5 atributos, crea 3 objetos y arroja la información de cada uno de ellos.

 */
package proyecto02;

/**
 *
 * @author Alumno
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socio objeto1 = new Socio(
            1,
            "Dharma",
            "Herrera",
            "Martinez",
            "dharma.herrera@gmail.com");
        objeto1.printSocio();
        
        Socio objeto2 = new Socio(
            2,
            "uruzla",
            "Martinez",
            "Bravo",
            "urzula.3004@gmail.com");
        objeto2.printSocio();
        
        Mascota objeto01 =  new Mascota(
            "pelusa",
            "san juanito 123",
            12345678,
            "gato",
            "pequeña");
        objeto01.printMascota();
        
        Mascota objeto02 = new Mascota(
            "lady",
            "valentina leppe 123",
            66178696,
            "perro",
            "pequeña");
        objeto02.printMascota();
        
        Mascota objeto03 = new Mascota(
            "maty",
            "valentina 1234",
            12345672,
            "gato",
            "grande");
        objeto03.printMascota();
    }
    
}
