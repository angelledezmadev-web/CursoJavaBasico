public class TipoDeDatos {
    public static void main(String[] args) {


        //-128 a 127
        byte chiquitos = 127;

       //short -32768 a 32767
       short pequeño = 32767;

       //int 32bits -2147483648 a 2147483647
        int entero = 2147483647;

        //long 64 -9223372036854775808 a 9223372036854775807
        long gigantes = 3872949493593493L;


        System.out.println("rango min de byte " + Byte.MIN_VALUE);
        System.out.println("rango max de byte " + Byte.MAX_VALUE);

        System.out.println("---------");

        System.out.println("rango min de short " + Short.MIN_VALUE);
        System.out.println("rango max de short " + Short.MAX_VALUE);


        System.out.println("---------");

        System.out.println("rango min de int " + Integer.MIN_VALUE);
        System.out.println("rango max de int " + Integer.MAX_VALUE);

        System.out.println("---------");

        System.out.println("rango min de long " + Long.MIN_VALUE);
        System.out.println("rango max de long " + Long.MAX_VALUE);


        System.out.println("---------");

        //tipos de datos  decimales

        System.out.println("rango min de float " + Float.MIN_VALUE);
        System.out.println("rango max de float " + Float.MAX_VALUE);
        float flotante = 3.4028235E38f;


        System.out.println("rango min de double " + Double.MIN_VALUE);
        System.out.println("rango max de double " + Double.MAX_VALUE);

        double doble = 1.7976931348623157E308;

        //tipos de datos char unicode

        char caracter = '2';
        char omega = '\u03A9';
        System.out.println("omega = " + omega);

        //tipo de dato de decisiones
        boolean decision = false;

        System.out.println("decision = " + decision);
        
        //tipo de datos object o refencia
        String nombre = "mario";

        System.out.println("nombre = " + nombre);        


    }
}
