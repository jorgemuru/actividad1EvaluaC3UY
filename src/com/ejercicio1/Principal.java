package com.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = 0;

        System.out.println("Sofka U :: Training - Intro JAVA - Mentoria 29 de junio");
        System.out.println("Ejercicio 1 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> ¿Es PAR? <<<<<<<<<<<<<<<<<<<<");

        try {
            System.out.println("Ingrese un numero mayor a CERO:");
            numero = lector.nextInt();

            if(numero > 0){
                if((numero%2)==0){
                    System.out.println("El numero " + numero + " es PAR.");
                }else{
                    System.out.println("El numero " + numero + " es IMPAR.");
                }
            }else{
                System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO MAYOR A CERO!!!");
            }
        }catch (InputMismatchException e){
            System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
        }
    }//fin main
}//fin clase
