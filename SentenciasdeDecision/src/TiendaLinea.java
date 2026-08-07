import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Línea con Descuentos ***");
        final var MONTO_MINIMO_PARA_DESCUENTO = 1000.00;

        var consola = new Scanner(System.in);

        System.out.println("Cual es el monto de la compra");
        var compraCliente = Double.parseDouble(consola.nextLine());

        System.out.println("Eres miembro de la tienda");
        var eresMiembro = Boolean.parseBoolean(consola.nextLine());

        var descuento = 0.0; //se puede dejar la variable vacia o poner 0.0 para decir que es de tipo double
        //        double descuento ;

        if (compraCliente >= MONTO_MINIMO_PARA_DESCUENTO && eresMiembro){
            descuento = 0.1;  //DESCUENTO DE 10%
        } else if (eresMiembro) {
            descuento = 0.05; //DESCUENTO DE 5%
        }else {  //NO SUPERO EL MONTO MINIMO NI ES MIEMBRO
            descuento = 0;  // DESCUENTO DE CERO
        }

//HACEMOS LOS CALCULOS RESPECTIVOS PARA OBTENER EL FINAL
        if (descuento != 0){
            var montoDescuento = compraCliente * descuento;
            var montoFinal = compraCliente - montoDescuento;
            System.out.printf("""
                    %n Felicidades obtuviste un descuento de %.0f%%
                    Monto de la compra es: $%.2f
                    Monto de descuento es: $%.2f
                    Monto final de compra con el descuento: $%.2f
                    """,descuento * 100,compraCliente,montoDescuento,montoFinal);
        }
        else {
            System.out.printf("""
                    %nLo sentimos no obtuviste un descuento
                    Te invitamos a ser miembro de la tienda
                    Monto total de la compra es: $%.2f
                    """, compraCliente);
        }


    }
}