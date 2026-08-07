public class MasConcatenaciones {
    public static void main(String[] args) {
        //Concatenacio simple con operador +

        var numero = 4;
        var numero2 = 6;
        var suma = numero2 + numero;
        System.out.println("suma = " + suma);

        //forma de concatenacion concat
        var nombre1 = "hola";
        var nombre2 = "Mundo";
        var unirContac = nombre1.concat(" ").concat(nombre2);
        System.out.println("unirContat = " + unirContac);

        System.out.println("--------------------------------");
        //metodo StringBuilder
         var stringBuilder = new StringBuilder();
            stringBuilder.append(nombre1);
            stringBuilder.append(" ");
            stringBuilder.append(nombre2);
        var resultado = stringBuilder.toString();
        System.out.println("resultado = " + resultado);

        //metodo StringBuffer

        /*
        var stringBuffer = new StringBuffer();
        stringBuffer.append(nombre1);
        stringBuffer.append(" ");
        stringBuffer.append(nombre2);
        var resultado2 = stringBuffer.toString();
        System.out.println("resultado2 = " + resultado2);
         */

        var stringBuffer = new StringBuffer();
            stringBuffer.append(nombre1).append(" ").append(nombre2).toString();
        System.out.println("stringBuffer = " + stringBuffer);

//metodo join
        var resultados = String.join("/",nombre1,nombre2,nombre1,nombre2,nombre1,nombre2);
        System.out.println("resultados = " + resultados);


        System.out.println("--------------------------------");

        //caracteres especiales   \

        var nombres = """
                \nhola
                \tmexico
                'querido'
                "amigable"
                """;
        System.out.println("nombres = " + nombres);

        var nombres2 = "\"hola\"";

        System.out.println("nombres2 = " + nombres2);

        nombres2 = "\'mexico\'";
        System.out.println("nombres2 = " + nombres2);
         nombres2= "\\chihuahua ";
        System.out.println("nombres2 = " + nombres2);


//var caracter = '\'a\'';
  //      System.out.println("caracter = " + caracter);





    }
}
