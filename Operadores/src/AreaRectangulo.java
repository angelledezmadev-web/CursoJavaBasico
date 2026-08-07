import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {

        System.out.println("Calcular Area y Perimetro de Rectangulo");

        var consola = new Scanner(System.in);

        System.out.println("Cual es la base: ");
        var base = Double.parseDouble(consola.nextLine());

        System.out.println("Cual es la Altura: ");
        var altura = Double.parseDouble(consola.nextLine());

        var perimetro = 2 * (base + altura);
        var area = base * altura;

        System.out.printf("""
                \t Los resultados son:
                El area es: %.2f cm
                El perimetro es: %.2f cm
                """,area,perimetro);
    }
}
