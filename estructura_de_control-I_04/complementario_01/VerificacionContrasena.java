import java.util.Scanner;

public class VerificacionContrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena = "123456";
        System.out.println("Ingresa tu contraseña: ");
        String contrasenaIngresada = sc.nextLine();
        if (contrasena.equals(contrasenaIngresada)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }
        sc.close();
    }
}
