import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("Numeros Aleatoreos");

        var ramdom = new Random();

        //numero ramdom del 0 a 9
        var numAleatorio = ramdom.nextInt(10);
        System.out.println("numAleatorio = " + numAleatorio);

        //numero ramdon del 1 al 10
        numAleatorio = ramdom.nextInt(10)+ 1;
        System.out.println("numAleatorio2 = " + numAleatorio);

        var numAleatorioFloat = ramdom.nextFloat(0,1);
        System.out.println("numAleatorioFloat = " + numAleatorioFloat);

        //ejemplo de como trabaja un dado
        //rango del 1 al 6
        //(6) + 1 pasa de empezar en el cero al 1
        var dado = ramdom.nextInt(6)+ 1;
        System.out.println("dado = " + dado);


    }
}
