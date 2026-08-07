import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {

        System.out.println("*** Sistema de Reserva de Hotel ***");

        final var TARIFA_SIN_VISTA = 150.50;
        final var TARIFA_CON_VISTA = 190.50;

        var consola = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        var nombreCliente = consola.nextLine();

        System.out.print("Dias de estancia en el hotel: ");
        var diasEstancia = Integer.parseInt(consola.nextLine());

        System.out.print("Quiere cuarto con vista al Mar (true/false): ");
        var vistaMar = Boolean.parseBoolean(consola.nextLine());

        var costoTotal = 0.0; //tambien se puede dejar vacia

        if (vistaMar){
                costoTotal= diasEstancia * TARIFA_CON_VISTA;
        }else{
            costoTotal= diasEstancia * TARIFA_SIN_VISTA;

        }

        //detalles de la reserva

        System.out.printf("""
                    Detalles de la reservacion
                    Cliente: %s
                    Dias de Estancia: %d
                    Costo Total: $%.2f
                    Habitacion con vista la mar: %s
                    """,nombreCliente,diasEstancia,costoTotal,
                vistaMar ? "Si :)" : "No :(");



    }
}
