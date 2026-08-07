import java.util.Scanner;

public class AppSaludFitness {
    public static void main(String[] args) {

        final var META_PASOS_DIARIOS =  10000;
        final var CALORIAS_POR_PASO = 0.04;  //VALOR APROX DE CALORIAS QUEMADAS POR PASO

        var consola = new Scanner(System.in);

        System.out.println("Aplicacion de Salud y Fitness");


        System.out.print("Ingresa tu nombre");
        var nombreUsuario = consola.nextLine();

        System.out.print("Ingresa los pasos caminados en el dia");
        var pasoCaminadosDia = Integer.parseInt(consola.nextLine());

        var caloriasQuemadas = pasoCaminadosDia * CALORIAS_POR_PASO;

        //var meta_alcanzada = pasoCaminadosDia >= META_PASOS_DIARIOS;


        if (pasoCaminadosDia >= META_PASOS_DIARIOS){
            System.out.printf("""
                    Felicidades %s llegaste a la meta
                    Tus pasos fueron de: %d
                    Tus Calorais quemadas son de: %.2f
                    """,nombreUsuario,pasoCaminadosDia,caloriasQuemadas);
        }else {
            System.out.println(nombreUsuario);
            System.out.println("Lo siento, no llegaste a la meta diaria");
            System.out.println("Tus pasos fueron de: " + pasoCaminadosDia);
            System.out.println("Tus Calorais quemadas son de: "+ caloriasQuemadas);
        }

        var meta_alcanzada = (pasoCaminadosDia >= META_PASOS_DIARIOS) ? "Si llego :)": "No llego :(";
        System.out.println("meta_alcanzada con operador ternario = " + meta_alcanzada);
    }
}
