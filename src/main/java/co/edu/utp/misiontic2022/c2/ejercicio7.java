package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char Letra;

        System.out.println("Ingrese una letra:");
        Letra = sc.nextLine().charAt(0);
        
        if (Character.isUpperCase(Letra)){
            System.out.println("La letra "+Letra+" es mayúscula");
        }else{
            System.out.println("La letra "+Letra+" es minúscula");
        }
        sc.close();
    }
}
