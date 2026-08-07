import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("Sistema de empleados");

        var consola = new Scanner(System.in);

        System.out.println("INTRODUCE TU NOMBRE = ");
        var nombreEmpleado = consola.nextLine();

        System.out.println("INTRODUCE TU EDAD");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.println("INTRODUCE TU SALARIO");
        var salario = Double.parseDouble(consola.nextLine());

        System.out.println("ERES JEFE DE DEPTO (true/false)");
        var esJefe = Boolean.parseBoolean(consola.nextLine());

        //imprimir valores

        System.out.println("\n Datos del Empledado");
        System.out.println("\t Nombre= "+ nombreEmpleado);
        System.out.println("\t Edad= "+ edad);
        //System.out.println("\t Salario = $%.2f".formatted(salario));
        System.out.printf("\t Salario = $%.2f%n", salario);

        System.out.println("\t Es Jefe= "+ esJefe);




    }
}
