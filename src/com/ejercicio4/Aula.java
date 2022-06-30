package com.ejercicio4;

public class Aula {
    public static enum Materia {MATEMATICAS, FILOSOFIA, FISICA};
    private int numero;
    private int aforo;
    private Persona profesor = new Profesor();

    public Aula(int numero, int aforo, Persona profesor) {
        this.numero = numero;
        this.aforo = aforo;
        this.profesor = profesor;
    }
    public Aula() {
    }


}//Fin clase
