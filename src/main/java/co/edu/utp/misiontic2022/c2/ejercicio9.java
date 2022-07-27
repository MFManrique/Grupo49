package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Ingrese el primer número: ");
        n1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        n2 = sc.nextInt();

        System.out.println("Ingrese el tercer número: ");
        n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("El número " + n1 + " es el mayor");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("El número " + n2 + " es el mayor");
        } else {
            System.out.println("El número " + n3 + " es el mayor");
        }
        sc.close();
    }
}
