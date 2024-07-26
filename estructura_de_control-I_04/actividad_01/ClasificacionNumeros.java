import java.util.Scanner;

public class ClasificacionNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo");
        } else {
            System.out.println("El número " + numero + " es cero");
        }
        sc.close();
    }
}
