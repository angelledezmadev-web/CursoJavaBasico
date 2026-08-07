public class Reserva {
    public static void main(String[] args) {
        final String MENSAJE_BIENVENIDA = "Bienvenidos al hotel mexicano";
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);

        var clienteHotel = "Juan Pablo";
        var instancia = 5;
        var tarifaDiaria= 500;
        var vista = false;

        System.out.println("Nombre de huesped " + clienteHotel);
        System.out.println("Dias de Instancia " + instancia);
        System.out.println("Tarifa diaria $" + tarifaDiaria);
        System.out.println("Costo Total $ " + tarifaDiaria *instancia );
        System.out.println("Tiene vista al mar= " + vista);

    }
}
