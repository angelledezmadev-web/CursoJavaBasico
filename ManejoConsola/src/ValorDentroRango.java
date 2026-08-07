import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Esta Dentro De Rango ***");
        final var MINIMO = 0;
        final var MAXIMO = 5;

        //solicitar por consola un numero entre 0 a 5
        System.out.println("Introduce un numero de 0 a 5");

        var datoConsola = Integer.parseInt(new Scanner(System.in).nextLine());

        var estaDentroRango = datoConsola >=MINIMO && datoConsola <= MAXIMO;
        System.out.println("estaDentroRango = " + estaDentroRango);


    }
}
