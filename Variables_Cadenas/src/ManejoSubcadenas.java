public class ManejoSubcadenas {
    public static void main(String[] args) {

        var escuela = "Facultad De Estudios Superiores Aragon";
        System.out.println("escuela = " + escuela);
        System.out.println(escuela.length());
        //solo imprimir "Facultad"

       var subCadena = escuela.substring(0,8);
        System.out.println("subCadena = " + subCadena);

        var subCadena2 = escuela.substring(12,20);
        System.out.println("subCadena2 = " + subCadena2);

        var indiceInit = escuela.indexOf("Estudios");
        System.out.println("indiceInit = " + indiceInit);

       //metodo lastIndexOf
       var nombre = "mario angel mario angel mario angel" ; //30
       var indiceUltimo = nombre.lastIndexOf("angel");
        System.out.println("indiceUltimo = " + indiceUltimo);

        var inicial = nombre.indexOf("angel"); //6
        System.out.println("inicial = " + inicial);






    }
}
