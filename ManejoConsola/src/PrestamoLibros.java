import java.util.Scanner;

public class PrestamoLibros {
    public static void main(String[] args) {

        System.out.println("*** Sistema de Prestamo de Libros ***");

        var consola = new Scanner(System.in);
        //var libroBoolean = true;
        var distanciaMax = 3.0;

        System.out.println("Tienes Credencial Estudiantil ( true/false ) ");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());
        System.out.println("tieneCredencial = " + tieneCredencial);

        System.out.println("Vives a no mas de 3km?");
        var usuarioDistancia = Double.parseDouble(consola.nextLine());
        System.out.println("usuario Distancia = " + usuarioDistancia);

        var prestamoLibros = tieneCredencial  || usuarioDistancia <=distanciaMax;
        System.out.println("Es suceptible a prestamo = " + prestamoLibros);


    }
}
