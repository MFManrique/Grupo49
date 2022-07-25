package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero entero:");
        num = sc.nextInt();

        if (num%10 == 0) 
            System.out.println("El numero "+ num +" es multiplo de 10");           
        else
            System.out.println("No es multiplo de 10");
        sc.close();    
    }
}