import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {

        System.out.println("*** generado de Ticket ***");

        var consola = new Scanner(System.in);

        System.out.print("Introduce el precio de la leche");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Introduce el precio del pan");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Introduce el precio de la lechuga");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Introduce el precio del platano");
        var precioPlatano = Double.parseDouble(consola.nextLine());

        var totaiSinIva = precioLeche + precioLechuga + precioPan + precioPlatano ;
        System.out.println("totaiSinIva = " + totaiSinIva);

        var ivaCompra = totaiSinIva * 0.16;
        System.out.println("ivaCompra = " + ivaCompra);

        var totalConIva = totaiSinIva + ivaCompra;
        System.out.println("totalConIva = " + totalConIva);

//formatear con printf
        System.out.printf("""
              \t Precio Normalizado
              Subtotal:         $%.2f
              Impuesto (16%%):  $%.2f
              Costo Total:      $%.2f            
     """,totaiSinIva,ivaCompra,totalConIva);

    }
}
