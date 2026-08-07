import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println("Parque de los espejos");

        var consola = new Scanner(System.in);

        final var EDAD_MINIMA_ENTRADA = 10;

        System.out.println("Cual es tu edad");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.println("Tienes miedo a la oscuridad");
        var tienesMiedoOscuridad = Boolean.parseBoolean(consola.nextLine());


        if (!tienesMiedoOscuridad && edad >= EDAD_MINIMA_ENTRADA){
            System.out.println("Felicidades puedes entrar");
        }else {
            System.out.println("lo siento la casa puede darte mucho Meyooooooo");
        }


    }
}
