package clase_scanner_y_operadores_02.actividad_02;

import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 5;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;
        System.out.println("La suma de " + a + " y " + b + " es " + suma);
        System.out.println("La resta de " + a + " y " + b + " es " + resta);
        System.out.println("La multiplicación de " + a + " y " + b + " es " + multiplicacion);
        System.out.println("La división de " + a + " y " + b + " es " + division);
        System.out.println("El módulo de " + a + " y " + b + " es " + modulo);
        System.out.println("Ingrese un número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = sc.nextInt();
        int suma2 = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma2);
        sc.close();
    }
}
