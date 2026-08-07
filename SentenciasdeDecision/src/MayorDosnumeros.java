import java.util.Scanner;

public class MayorDosnumeros {
    public static void main(String[] args) {

        System.out.println("Reto Mayor de Dos numeros");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        var numero1 = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa un segundo numero: ");
        var numero2 = Integer.parseInt(consola.nextLine());


        //System.out.println("El numero mayor es: ");
        var numeroMayor = ("el numero mayor es ")+( numero1 >numero2 ? numero1 : numero2);
        System.out.println(numeroMayor);


        //en el ejemplo de ubaldo es con if else
    }
}
