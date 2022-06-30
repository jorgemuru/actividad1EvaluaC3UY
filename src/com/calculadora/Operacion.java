package com.calculadora;

import java.util.Scanner;

public class Operacion {
    static double numero1;
    static double numero2;
    static double res;
    char resultado;
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Mentoria 29 de Junio :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> CalcuSystem 3000 <<<<<<<<<<<<<<<<<<<<");


        System.out.println("Ingrese el numero 1:");
        numero1 = lector.nextDouble();
        System.out.println("Ingrese el numero 2:");
        numero2 = lector.nextDouble();

        System.out.println("-------------- Operaciones realizadas --------------");
        //Suma
        Suma unaSuma = new Suma(numero1, numero2);
        res = unaSuma.suma;
        System.out.println("Resultado de la SUMA: " + res);

        //Resta
        Resta unaResta = new Resta(numero1, numero2);
        res = unaResta.resta;
        System.out.println("Resultado de la RESTA: " + res);

        //Division
        Division unaDivision = new Division(numero1, numero2);
        res = unaDivision.division;
        System.out.println("Resultado de la DIVISION: " + res);

        //Multiplicacion
        Multiplica unaMultiplica = new Multiplica(numero1, numero2);
        res = unaMultiplica.multiplica;
        System.out.println("Resultado de la MULTIPLICACION: " + res);

        //Exponente
        Modulo unModulo = new Modulo(numero1, numero2);
        res = unModulo.modulo;
        System.out.println("Resultado del EXPONENTE: " + res);
    }

    public Operacion(double n1, double n2, char resultado){
        this.numero1 = n1;
        this.numero2 = n2;
        this.resultado = resultado;
    }

    public void verResultado(){
        System.out.println(this.numero1+ " "+this.resultado+" " +this.numero2+ " "+this.res);
    }
}//fin clase
