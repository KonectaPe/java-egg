import java.util.Scanner;

public class CalculoDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto: ");
        double precio = sc.nextDouble();
        if (precio >= 100) {
            double descuento = precio * 0.10;
            double precioFinal = precio - descuento;
            System.out.println("El precio final con descuento es: " + precioFinal);
        } else {
            System.out.println("No aplica descuento.");
        }
        sc.close();
    }
}
