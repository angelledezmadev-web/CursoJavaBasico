public class OperadoresAsignacion {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        a += b; // a = a + b
        System.out.println("Suma y asignación: " + a); // Salida: 13
        a -= b; // a = a - b
        System.out.println("Resta y asignación: " + a); // Salida: 10
        a *= b; // a = a * b
        System.out.println("Multiplicación y asignación: " + a); // Salida: 30
        a /= b; // a = a / b
        System.out.println("División y asignación: " + a); // Salida: 10
        a %= b; // a = a % b

        System.out.println("Módulo y asignación: " + a); // Salida: 1
    }
}
