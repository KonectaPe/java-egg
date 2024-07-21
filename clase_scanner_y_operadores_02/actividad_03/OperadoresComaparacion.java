package clase_scanner_y_operadores_02.actividad_03;

import java.util.Scanner;

public class OperadoresComaparacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número entero: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa otro número entero: ");
        int n2 = sc.nextInt();
        System.out.println("El número " + n1 + " es mayor a " + n2 + "? = " + (n1 > n2));
        System.out.println("El número " + n1 + " es distinto a " + n2 + "? = " + (n1 != n2));
        System.out.println("El número " + n1 + " es divisible por 2 " + "? = " + (n1 % 2 == 0));
        System.out.println("Ingrese otro número entero: ");
        int n3 = sc.nextInt();
        System.out.println("Ingresa otro número entero: ");
        int n4 = sc.nextInt();
        if (n1 > n2 && n3 > n4) {
            System.out.println("Los números " + n1 + " y " + n3 + " son mayores que " + n2 + " y " + n4);
        } else {
            System.out.println("Los números " + n1 + " y " + n3 + " no son mayores que " + n2 + " y " + n4);
        }
        if (n1 > n2 || n3 > n4) {
            System.out.println("Al menos uno de los números " + n1 + " y " + n3 + " es mayor que " + n2 + " y " + n4);
        } else {
            System.out.println("Ninguno de los números " + n1 + " y " + n3 + " es mayor que " + n2 + " y " + n4);
        }
        sc.close();
    }
}
