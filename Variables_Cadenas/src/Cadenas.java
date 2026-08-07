public class Cadenas {
    public static void main(String[] args) {
        String nombre = "mario";
        String segNomber = "mario";

        String nombre2 = new String("mario");

                //mulples linea o text block

        var cadena1 = """ 
                este
                es un texto
                multilinea
                """;

        System.out.println(cadena1);
        nombre = "angel";

        System.out.println("hola" + "mudno " + "feo " + "hamasfa");


        cadena1 = "mario";

        System.out.println("cadena1 = " + cadena1);


        var nombres = "hola mundo mexioc lisdi y quedaidadnak";
        var numCaracte = nombres.length();
        System.out.println(numCaracte);


        var pais = "Paises Bajos";
        var carPais = pais.length();
        var carInicialPais = pais.charAt(7);
        System.out.println("carInicialPais = " + carInicialPais);



    }
}
