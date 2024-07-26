import java.util.Scanner;

public class ClasificandoPuntuacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la puntuación entre 0 y 100: ");
        double puntuacion = sc.nextDouble();
        if (puntuacion >= 90 && puntuacion <= 100) {
            System.out.println("A");
        } else if (puntuacion >= 80 && puntuacion < 90) {
            System.out.println("B");
        } else if (puntuacion >= 70 && puntuacion < 80) {
            System.out.println("C");
        } else if (puntuacion >= 60 && puntuacion < 70) {
            System.out.println("D");
        } else if (puntuacion >= 0 && puntuacion < 60) {
            System.out.println("F");
        } else {
            System.out.println("Puntuación inválida");
        }
        sc.close();
    }
}
