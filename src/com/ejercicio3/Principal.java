package com.ejercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double sueldo = 0;
        byte area = 0;
        byte cantidadHijos = 0;
        double bonificacion = 0.0;
        double sueldoLikido = 0.0;

        DecimalFormat decimales = new DecimalFormat("#.00");

        System.out.println("Sofka U :: Training - Intro JAVA - Mentoria 29 de junio");
        System.out.println("Ejercicio 3 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Calcular sueldo <<<<<<<<<<<<<<<<<<<<");

        System.out.println("Ingrese el sueldo nominal:");
        sueldo = lector.nextDouble();
        System.out.println("Ingrese el Area de Trabajo (1: SISTEMAS, 2: CONTABILIDAD, 0: OTROS)");
        area = lector.nextByte();
        System.out.println("Ingrese la cantidad de hijos:");
        cantidadHijos = lector.nextByte();

        //Calculo la bonificacion por el area de trabajo
        switch(area){
            case 1:
                bonificacion = (sueldo * 25) / 100;
            case 2:
                bonificacion = (sueldo * 20) / 100;
            default:
                bonificacion = (sueldo * 10) / 100;
        }

        //Calculo la bonicificacion para cantidad de hijos >= 2
        if (cantidadHijos >=2){
            bonificacion = bonificacion + (cantidadHijos * 150);
        }

        //Calculo el sueldo likido
        sueldoLikido = sueldo + bonificacion;

        System.out.println("______________________________________________________");
        System.out.println("Su bonificacion por area es de : " + bonificacion);
        System.out.println("Su bonificacion por cantidad de hijos es de: " + (cantidadHijos*150));
        System.out.println("______________________________________________________");
        System.out.println("El Sueldo TOTAL es de: " + sueldoLikido);

    }//main
}//fin clase
