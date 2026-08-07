import java.util.Scanner;

public class ConversionDeDatos {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.println("Ingresa un numero");

        var numero = consola.nextLine();
        var numeroParse = Integer.parseInt(numero);

        System.out.println(numeroParse + 10);


        var numerodecimal = consola.nextLine();
        var numeroDedimalParse = Double.parseDouble(numerodecimal);
        System.out.println("numeroDedimalParse = " + numeroDedimalParse);

        var decision = consola.nextLine();
        var decisionParse = Boolean.parseBoolean(decision);
        System.out.println("decisionParse = " + decisionParse);


        var numeroFlotante = consola.nextLine();
        var numeroFlotanteParse = Float.parseFloat(numeroFlotante);
        System.out.println("numeroFlotanteParse = " + numeroFlotanteParse);

        consola.close();
    }
}
