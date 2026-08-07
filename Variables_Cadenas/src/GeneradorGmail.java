public class GeneradorGmail {
    public static void main(String[] args) {

        System.out.println("***Generador De Email***");

        var nombreUsuario = "Mario Angel Ledezma ";
        var nombreUsuarioNormalizado = nombreUsuario.trim().toLowerCase().replace(" ",".");

        System.out.println("nombreUsuario = " + nombreUsuario);
        System.out.println("nombreUsuarioNormalizado = " + nombreUsuarioNormalizado);

        System.out.println("-------------");

        var nombreEmpresa = " Global Mentoring ";
        var extensionDominio = ".com.mx";
        var dominioEmailNormalizado = ("@" + nombreEmpresa.toLowerCase().replace(" ","")+extensionDominio);

        System.out.println("nombreEmpresa = " + nombreEmpresa);
        System.out.println("extensionDominio = " + extensionDominio);
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);

        System.out.println("-------------");

        var emailFinalGenerado = nombreUsuarioNormalizado + dominioEmailNormalizado;
        System.out.println("emailFinalGenerado = " + emailFinalGenerado);

    }
}
