public class Sentencia_If_Else {
    public static void main(String[] args) {
        final var edadPermitida = 18;

        System.out.println("pon tu edad:");

        var edadUsuario = 16;

        if (edadUsuario >= edadPermitida) {
            System.out.println("Eres mayor de edad, puedes pasar");
        } else {
            System.out.println("Estas chavo regresate a tu canton");
        }

    }
}
