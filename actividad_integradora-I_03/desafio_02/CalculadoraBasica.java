package desafio_02;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();
        System.out.println("Ingrese la operación a realizar (+, -, *, /): ");
        char operacion = sc.next().charAt(0);
        double resultado = operacion == '+' ? numero1 + numero2 : operacion == '-' ? numero1 - numero2 : operacion == '*' ? numero1 * numero2 : operacion == '/' ? numero1 / numero2 : Double.parseDouble("Opción inválida");
        System.out.println("El resultado es: " + resultado);
    }
}
