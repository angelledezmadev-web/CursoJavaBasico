public class NumerosImpares {
    public static void main(String[] args) {
        int contador = 1;
        /*while (contador > 0){
            if (contador % 2 != 0)
                System.out.println(contador + " ");
            contador--;
        }*/

        do {
            if (contador % 2 != 0)
                System.out.print(contador + " ");
            contador++;
        }while(contador <= 20);
    }
}
