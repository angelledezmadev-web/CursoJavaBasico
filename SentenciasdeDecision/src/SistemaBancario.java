import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {

        System.out.println("Sistema Bancario");

        System.out.println("Desear salir del sistema (true/false)");

        var consola = new Scanner(System.in);
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        if (!salirSistema){
            System.out.println("Continuamos dentro del sistema");
        }else {
            System.out.println("Saliendo del sistema.....");
        }



    }
}
