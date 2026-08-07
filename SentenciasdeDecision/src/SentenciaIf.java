public class SentenciaIf {
    public static void main(String[] args) {

        final var edadPermitida = 18;

        System.out.println("pon tu edad:");

        var edadUsuario = 20;

        if (edadUsuario >= edadPermitida) {
            System.out.println("Eres mayor de edad, puedes pasar");
        }

    }
}
