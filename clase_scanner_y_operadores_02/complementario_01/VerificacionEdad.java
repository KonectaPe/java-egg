package clase_scanner_y_operadores_02.complementario_01;

import java.util.Scanner;

public class VerificacionEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int ANIOACTUAL = 2024;
        System.out.println("Ingrese su año de nacimiento:");
        int anioNacimiento = sc.nextInt();
        int calculoEdad = ANIOACTUAL - anioNacimiento;
        if (calculoEdad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
        sc.close();
    }
}
