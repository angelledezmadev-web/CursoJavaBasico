import java.util.Scanner;

public class GeneradoEmail {
    public static void main(String[] args) {

        System.out.println("***GENERADOR DE EMAILS***");

        System.out.println("Introduce tu nombre completo");
        var consola = new Scanner(System.in);
        var nombreUsuario = consola.nextLine();
        System.out.println("nombreUsuario = " + nombreUsuario);

       var nombreUsuarioNormalizado = nombreUsuario.toLowerCase().trim().replace(" ",".");
        System.out.println("nombreUsuarioNormalizado = " + nombreUsuarioNormalizado);

        System.out.println("Introduce el nombre de la empresa");
        var nombreEmpresa = consola.nextLine();
        System.out.println("nombreEmpresa = " + nombreEmpresa);


        System.out.println("Introduce la extension de dominio");
        var dominio = consola.nextLine();
        System.out.println("dominio = " + dominio);

        var dominioEmailNormalizado = ("@" + nombreEmpresa.toLowerCase().replace(" ","").strip()+ dominio);
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);
    }
}
