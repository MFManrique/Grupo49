package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, M, S;

        System.out.println("Ingrese la hora: ");
        H = sc.nextInt();
        System.out.println("Ingrese los minutos: ");
        M = sc.nextInt();
        System.out.println("Ingrese los segundos: ");
        S = sc.nextInt();

        if (H > 0 && H <= 12 && M >= 0 && M < 60 && S >= 0 && S < 60) {
            System.out.println("La hora ingresada es " + H + ":" + M + ":" + S);
        } else {
            System.out.println("Por favor revise los valores ingresados");
        }
        sc.close();
    }
}
