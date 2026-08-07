import java.util.Scanner;

public class SistemaAutentificacion {
    public static void main(String[] args) {

        System.out.println("Sistema de Autentificacion");

        final var USER = "marioangel";
        final var PASSWORD = "holacrayola777";

                var consola = new Scanner(System.in);

        System.out.println("User login: ");
        var userLogin = consola.nextLine();

        System.out.println("Password: ");
        var passUser = consola.nextLine();

        var authetication = userLogin.equals(USER)  && passUser.equals(PASSWORD);
        System.out.println("authetication is = " + authetication);


    }
}
