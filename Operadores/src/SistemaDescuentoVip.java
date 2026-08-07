import java.util.Scanner;

public class SistemaDescuentoVip {
    public static void main(String[] args) {

        System.out.println("*** Sistemas de Descuentos para Clientes Vip ***");

        final var MINIMO_PRODUCTOS_DESCUENTOS = 10;

        var consola = new Scanner(System.in);

        System.out.println("Indique cuantos articulos a comprado");
        var articulosComprados = Integer.parseInt(consola.nextLine());
        System.out.println("Cantidad de articulos Comprados = " + articulosComprados);

        System.out.println("Cuenta con membresia vip (true/false)");
        var tieneMenbresia = Boolean.parseBoolean(consola.nextLine());
        System.out.println("tiene Menbresia? = " + tieneMenbresia);

        var descuentoVip =
                articulosComprados >= MINIMO_PRODUCTOS_DESCUENTOS && tieneMenbresia;

        System.out.println("su Descuento es = " + descuentoVip);

    }
}
