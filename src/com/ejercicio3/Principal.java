package com.ejercicio3;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double sueldo = 0;
        byte area = 0;
        byte cantidadHijos = 0;
        double bonificaArea = 0.0;
        double bonificaHijos = 0.0;
        double sueldoLikido = 0.0;

        System.out.println("Sofka U :: Training - Intro JAVA - Mentoria 29 de junio");
        System.out.println("Ejercicio 3 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Calcular sueldo <<<<<<<<<<<<<<<<<<<<");

        try{
            System.out.println("Ingrese el sueldo nominal:");
            sueldo = lector.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
        }
        try{
            System.out.println("Ingrese el Area de Trabajo (1: SISTEMAS, 2: CONTABILIDAD, 0: OTROS)");
            area = lector.nextByte();
        }catch (InputMismatchException e){
            System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
        }
        try{
            System.out.println("Ingrese la cantidad de hijos:");
            cantidadHijos = lector.nextByte();
        }catch (InputMismatchException e){
            System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
        }

        //Calculo la bonificacion por el area de trabajo
        switch(area){
            case 1:
                bonificaArea = (sueldo * 25) / 100;
                break;
            case 2:
                bonificaArea = (sueldo * 20) / 100;
                break;
            default:
                bonificaArea = (sueldo * 10) / 100;
        }

        //Calculo la bonicificacion para cantidad de hijos >= 2
        if (cantidadHijos >=2){
            bonificaHijos = cantidadHijos * 150;
        }

        //Calculo el sueldo likido
        sueldoLikido = sueldo + bonificaArea + bonificaHijos;

        System.out.println("______________________________________________________");
        System.out.println("Su bonificacion por area es de : " + bonificaArea);
        System.out.println("Su bonificacion por cantidad de hijos es de: " + bonificaHijos);
        System.out.println("______________________________________________________");
        System.out.println("El Sueldo TOTAL es de: " + sueldoLikido);

    }//main
}//fin clase
