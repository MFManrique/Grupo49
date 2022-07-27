package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float dividendo, divisor, division;
  
        System.out.println("Introduzca el dividendo");
        dividendo = sc.nextFloat();

        System.out.println("Introduzca el divisor");
        divisor = sc.nextFloat();

        if (divisor == 0) {
            System.out.println("No es posible dividir entre 0");
        }         
        else{
            division = dividendo / divisor;
            System.out.println("El resultado de la división es: " + division);
        }  
        sc.close();            
    }
}
