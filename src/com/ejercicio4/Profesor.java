package com.ejercicio4;

public class Profesor extends Persona{
    public static enum Materia {MATEMATICAS, FILOSOFIA, FISICA};
    private boolean disponible;

    public Profesor(String nombre, byte edad, char sexo, boolean disponible) {
        super(nombre, edad, sexo);
        this.disponible = disponible;
    }

    public Profesor() {
        super();
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //Funcion ke devuelve el porcentaje de asistencia a clase.
    @Override
    public int asistencia() {
        return 0;
    }
}//Fin clase
