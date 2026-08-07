public class MetodosCadenas {

    public static void main(String[] args) {

        var nombre = "Hola soy gernan masofnabnf hakbsdfk labdnsl abnlalskn als nlaladjkslfn aln lasn lksalalsn";
        
        var calcularTamano = nombre.length();
        System.out.println("calcularTamano = " + calcularTamano);


        //metodo de reemplazar caracteres
        var caracter = "Hola a Todos los amigos";
        var lenguajeIncluisivo = caracter.replace('o','e');

        System.out.println("caracter = " + caracter);
        System.out.println("lenguajeIncluisivo = " + lenguajeIncluisivo);


        System.out.println("-----------------------");

        //metodo de convertir a mayusculas

        var apellido = "Bienvenidos al Imalaya";
        var convMayus = apellido.toUpperCase();
        System.out.println("apellido = " + apellido);
        System.out.println("convMayus = " + convMayus);

        //metodo de convertir a minuscula

        var mensaje = "Hola A Todos Los Presentes";
        var convMinus = mensaje.toLowerCase();

        System.out.println("mensaje = " + mensaje);
        System.out.println("convMinus = " + convMinus);

        // metodo para eliminar espacios al inicio y al final de la cadena

        var pais = " Mexico es campeon ";
        System.out.println("pais = " + pais);

        //var eliminarEspacio = pais.trim();
        var eliminarEspacio = pais.strip();
        System.out.println("eliminarEspacio = " + eliminarEspacio);






    }
}
