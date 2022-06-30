package com.ejercicio4;

public class Estudiante extends Persona{
    private int calificacion;

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, byte edad, char sexo, int calificacion) {
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
    }

    @Override
    public int asistencia() {
        return 0;
    }
}//Fin clase
