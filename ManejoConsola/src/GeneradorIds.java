import java.util.Random;
import java.util.Scanner;

public class GeneradorIds {
    public static void main(String[] args) {
        System.out.println("Generador de Id unico");

        var consola = new Scanner(System.in);
        var ramdon = new Random();


        System.out.println("Proporciona tu Nombre");
        var nombre = consola.nextLine();

        System.out.println("Proporciona tu apellido");
        var apellido = consola.nextLine();

        System.out.println("Proporciona tu año de nacimiento (YYYY)");
        var anioNacimiento = consola.nextLine();

        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("anioNacimiento = " + anioNacimiento);
        System.out.println("--------------------------");

        var nombreFormat = nombre.trim().substring(0,2).toUpperCase();
        var apellidoFormat = apellido.trim().substring(0,2).toUpperCase();
        var anioNacimientoFormat = anioNacimiento.trim().substring(2,4);
        var numRamdon = ramdon.nextInt(99) + 1;

        var numRamdonFormat = String.format("%04d", numRamdon) ;


        var idUnico = nombreFormat+apellidoFormat+anioNacimientoFormat+numRamdonFormat;
        System.out.println("idUnico = " + idUnico);



        System.out.println(nombreFormat + " " + apellidoFormat+ " " + anioNacimientoFormat + "\nnumero ramdon :"+ numRamdon );

        System.out.println("--------------------------");

        System.out.println("numRamdonFormat = " + numRamdonFormat);



    }
}
