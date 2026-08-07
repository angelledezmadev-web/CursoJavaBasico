import java.util.Scanner;

public class LeerTiposDeDatos {
    public static void main(String[] args) {
        System.out.println(" Tipos de Datos");

        var consola = new Scanner(System.in);

     /*   System.out.print("Escribe tu nombre= ");
         var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        System.out.print("Escribe tu edad= ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        System.out.print("Escribe tu apellido= ");
        consola.nextLine();
        var apellido = consola.nextLine();
        System.out.println("apellido = " + apellido);
      */


        //esto es la forma normal y basica pero consume una variable y una linea de codigo extra
     //   var enteroString = consola.nextLine();
       // var numero = Integer.parseInt(enteroString);
        var numero = Integer.parseInt(consola.nextLine());
        System.out.println("numero = " + numero);
        System.out.println(numero + 5);

    }
}
