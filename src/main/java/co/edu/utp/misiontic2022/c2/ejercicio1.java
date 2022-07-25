package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año, suma, suerte, cifra1, cifra2, cifra3, cifra4;
        
        System.out.println("Por favor introduzca su fecha de nacimiento para saber su número de suerte");
        System.out.println("dia: ");
        dia = sc.nextInt();
        System.out.println("mes: ");
        mes = sc.nextInt();
        System.out.println("año: ");
        año = sc.nextInt();

        suma = dia + mes + año;

        cifra1 = suma/1000;
        cifra2 = suma/100%10;
        cifra3 = suma/10%10;
        cifra4 = suma%10;

        suerte = cifra1 + cifra2 + cifra3 + cifra4;
        System.out.println("Su número de la suerte es: " + suerte);
        sc.close();
    }
}
