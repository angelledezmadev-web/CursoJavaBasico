public class Basurero {
    public static void main(String[] args) {

        var cadena1 = "hola";
        var cadena2 = "mundo";
        var cadena3 = cadena1 + cadena2;
        System.out.println("cadena3 usando operador + = " + cadena3);


        cadena3 = cadena1.concat(cadena2);
        System.out.println("cadena3 usando concat = " + cadena3);


        var stringBuilder = new StringBuilder();

        stringBuilder.append(cadena1);
        stringBuilder.append(" ");
        stringBuilder.append(cadena2);

        var resultado = stringBuilder.toString();
        System.out.println("string Builder =" + resultado);

        var stringBuffer = new StringBuffer();

        stringBuffer.append(cadena1).append(" ").append(cadena2).toString();

        System.out.println("stringBuffer = " + stringBuffer);


        //metodo join

        cadena3 = String.join(" ", cadena1, cadena2);
        System.out.println("cadena3 con join = " + cadena3);
    }
}
