public class ComparacionCadenas {
    public static void main(String[] args) {

       String cadena1 = "Java";
       String cadena2 = "Java";

       //operador de comparacion ==

        System.out.println(cadena1==cadena2);

        String cadena3 = new String("Java");

        System.out.println(cadena1==cadena3);

        //el operado ==  es para comprar refencias


        String pais1 = "Mexico";
        String pais2 = "Mexico";
        String pais3 = new String("Mexico");
        // metodo .equal() es para comparar el contenido de 2 o mas variables

        System.out.println("metodo equals "+ pais1.equals(pais3));



    }

}

