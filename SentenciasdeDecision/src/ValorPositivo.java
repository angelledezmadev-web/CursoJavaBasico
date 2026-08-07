public class ValorPositivo {
    public static void main(String[] args) {

        System.out.println("dame un numero");
        var numero = 0;
        System.out.println("numero = " + numero);

        if (numero > 0){
            System.out.println("Tu numero es positivo");
        }else if (numero < 0){
            System.out.println("el numero es negativo ");
        }else {
            System.out.println("es cero");
        }

    }
}
