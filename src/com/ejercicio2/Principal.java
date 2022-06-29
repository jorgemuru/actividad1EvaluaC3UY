package com.ejercicio2;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean sigue = true;
        double millas = 9999999;
        double kilometros = 0.0;
        DecimalFormat decimales = new DecimalFormat("#.00");

        System.out.println("Sofka U :: Training - Intro JAVA - Mentoria 29 de junio");
        System.out.println("Ejercicio 1 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Convertir Millas a Kilometros <<<<<<<<<<<<<<<<<<<<");
        System.out.println("---------------- Ingresando CERO finaliza ----------------");

        while(sigue) {
            try {
                System.out.println("Ingrese el valor en Millas:");
                millas = lector.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
                break;
            }
            if (millas == 0){
                sigue = false;
            }
            else{
                kilometros = millas * 1.6093;
                System.out.println("Resultado: " + millas + " millas son " + decimales.format(kilometros) + " kilometros.");
            }
        }//Fin while
        System.out.println("---------------- FIN DEL PROGRAMA ---------------- ");

    }
}//fin clase
