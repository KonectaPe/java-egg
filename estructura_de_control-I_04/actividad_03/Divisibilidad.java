import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número entero: ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("El número " + num + " es divisible entre 3 y 5.");
        } else if (num % 3 == 0) {
            System.out.println("El número " + num + " es divisible entre 3.");
        } else if (num % 5 == 0) {
            System.out.println("El número " + num + " es divisible entre 5.");
        } else {
            System.out.println("El número " + num + " no es divisible entre 3 ni 5.");
        }
        sc.close();
    }
}
