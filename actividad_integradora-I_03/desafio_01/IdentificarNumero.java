package desafio_01;

import java.util.Scanner;

public class IdentificarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = sc.nextInt();
        String mensaje = (numero % 2 == 0) ? "El número ingresado es par." : "El número ingresado es impar.";
        System.out.println(mensaje);
        sc.close();
    }
}
