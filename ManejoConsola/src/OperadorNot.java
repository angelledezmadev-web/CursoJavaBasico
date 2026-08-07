public class OperadorNot {
    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;
        System.out.println("NOT lógico: " + (!x)); // Salida: false

        var rangoMinimo = 0;
        var rangoMaximo = 5;
        var posicion = 3;

        //esta en el rango
        var estaDentroRango = posicion >= rangoMinimo && posicion <= rangoMaximo;
        System.out.println("estaDentroRango = " + estaDentroRango);

        //fuera de rango
        var estaFueraRango = !(posicion >= rangoMinimo && posicion <= rangoMaximo);
        System.out.println("estaFueraRango = " + estaFueraRango);

    }
}
