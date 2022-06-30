package com.ejercicio4;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    private byte edadMax = 80;
    private int calificaMax = 10;
    static Scanner lector = new Scanner(System.in);
    private static int opcion = 0;
    private static Boolean sigue = true;

    public static void main(String[] args) {
        menuPrincipal();
        while(sigue) {
            if(opcion == 99) {
                sigue = false;
            }else {
                try {
                    System.out.println("Seleccione una opcion de la lista:");
                    opcion = lector.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
                }

                if(opcion>1&&opcion<=5){
                    System.out.println("---------- Funciones proximas a implementar ----------");
                }else if(opcion==6){
                    System.out.println("---------- Funcion de Demostracion ----------");
                }
            }
        }//fin while
    }//fin main

    /*Funcion ke realiza la carga de la clase segun los datos recibidos y las reglas determinadas:
    .- Aula habilitada (con profesor disponible y aforo <= cantidad de estudiantes.
    .- Si esta habilitada, llama al metodo "aprobados".
    */
    public boolean cargarClase(Date pFecha, Date pHora, Aula pSalon, ArrayList<Estudiante> pEstudiantes){
        Boolean resultado = false;

        return resultado;
    }//Fin cargarClase

    //Metodo ke muestra un listado en pantalla con los estudiantes aprobados por sexo, verificando
    // la calificacion y la asistencia de cada uno.
    public void aprobados(ArrayList<Estudiante> pEstudiantes){

    }//Fin aprobados

    public static void menuPrincipal(){
        System.out.println("Sofka U :: Training - Intro JAVA - Mentoria 29 de junio");
        System.out.println("Ejercicio 4 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> EDDI's TECHNOLOGY SCHOOL <<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>> Menu Principal <<<<<<<<<<<<<<<<<<<<");
        System.out.println("1.- Alta de Docente");
        System.out.println("2.- Alta de Estudiante");
        System.out.println("3.- Asignar Aula/Docente");
        System.out.println("4.- Asignar Materia/Aula");
        System.out.println("5.- Cargar Clase");
        System.out.println("6.- Ver DEMO");
        System.out.println("99.- FINALIZAR");
        System.out.println("-------------------------------------------");
    }//Fin menuPrincipal

}//fin clase
