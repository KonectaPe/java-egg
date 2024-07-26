import java.util.Scanner;

public class DeterminacionEdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        byte edad = sc.nextByte();
        if (edad >= 18 && edad <= 64) {
            System.out.println("Eres adulto.");
        } else if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }
        sc.close();
    }
}
