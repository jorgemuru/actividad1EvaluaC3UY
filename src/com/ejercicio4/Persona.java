package com.ejercicio4;

public abstract class Persona {
    private String nombre;
    private byte edad;
    private char sexo;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Persona(String nombre, byte edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    //Funcion ke devuelve el porcentaje de asistencia a clase.
    public abstract int asistencia();

}//fin clase
