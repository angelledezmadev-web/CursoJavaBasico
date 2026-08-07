import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        System.out.println("Entrada de Datos por Scanner");

        var consola = new Scanner(System.in);

        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        var numero = consola.nextInt();
        System.out.print("numero = ");
        System.out.println( numero + 6);

        var decimales = consola.nextFloat();
        System.out.println("decimales = " + decimales);

        var decision = consola.nextBoolean();
        //solo acepta: true Or false
        System.out.println("decision = " + decision);


        consola.nextLine();
        var apellido = consola.nextLine();
        System.out.println("apellido = " + apellido);



    }
}
