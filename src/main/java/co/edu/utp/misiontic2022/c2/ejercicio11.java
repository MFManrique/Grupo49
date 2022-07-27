package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;

        System.out.println("Ingrese el dígito del mes (Ej: Enero = 1): ");
        mes = sc.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 días");
                break;
            case 2:
                System.out.println("El mes tiene 28 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 dias");
                break;
            default:
                System.out.println("Ingrese un valor válido");
        }
        sc.close();
    }
}