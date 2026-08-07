import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        System.out.println("\tRECETA PARA LA COCINA :)");

        var consola = new Scanner(System.in);

        System.out.print("NOMBRE DE LA RECETA");
        var nombreReceta = consola.nextLine();

        System.out.print("INGREDIENTES PRICIPALES");
        var ingredientes = consola.nextLine();

        System.out.print("TIEMPO DE PREPARACIÓN (minutos)");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        System.out.print("DIFICULTAD  ( FACIL, MEDIA O DIFICIL 0_0 ) ");
        var dificultad = consola.nextLine();

        System.out.println("nombreReceta = " + nombreReceta);
        System.out.println("ingredientes = " + ingredientes);
        System.out.println("tiempoPreparacion = " + tiempoPreparacion);
        System.out.println("dificultad = " + dificultad);

    }
}
