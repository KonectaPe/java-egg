package clase_scanner_y_operadores_02.actividad_01;
import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println(nombre);
        System.out.println("Por favor, ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println(edad);
        System.out.println("Su nombre es " + nombre + " y su edad es " + edad);
        sc.close();
    }
}