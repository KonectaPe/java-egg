package clase_scanner_y_operadores_02.complementario_02;

import java.util.Scanner;

public class RectanguloAreaPerimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo:");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo:");
        double altura = sc.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        sc.close();
    }
}
