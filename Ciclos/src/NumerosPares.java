public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("*** Numeros Pares ***");

        int contador = 0;
       while(contador <=20){
           if (contador % 2 == 0)
               System.out.println(contador + " ");
           contador++;
       }
    }
}
