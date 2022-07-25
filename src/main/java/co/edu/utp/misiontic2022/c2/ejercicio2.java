package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioUnidad, iva, cantidadProducto, precioSinIva, totalIva, total;

        System.out.println("Por favor introduzca el precio del producto por unidad: ");
        precioUnidad = sc.nextDouble();

        System.out.println("Introduzca el número de productos vendidos: ");
        cantidadProducto = sc.nextDouble();

        System.out.println("Introduzca %IVA: ");
        iva = sc.nextDouble();

        precioSinIva = precioUnidad * cantidadProducto;
        totalIva = precioSinIva * iva / 100;
        total = precioSinIva + totalIva;

        System.out.println("El valor total de la venta es: " + total);
        sc.close();
    }
}