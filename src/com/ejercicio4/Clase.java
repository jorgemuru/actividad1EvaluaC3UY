package com.ejercicio4;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Date;

public class Clase {
    private Date fechaClase;
    private Date horaClase;
    private Aula salon = new Aula();
    private ArrayList<Estudiante> estudiantes = new ArrayList();

    public Clase(Date fechaClase, Date horaClase, Aula salon) {
        this.fechaClase = fechaClase;
        this.horaClase = horaClase;
        this.salon = salon;
    }

    public Date getFechaClase() {
        return fechaClase;
    }

    public void setFechaClase(Date fechaClase) {
        this.fechaClase = fechaClase;
    }

    public Date getHoraClase() {
        return horaClase;
    }

    public void setHoraClase(Date horaClase) {
        this.horaClase = horaClase;
    }

    public Aula getSalon() {
        return salon;
    }

    public void setSalon(Aula salon) {
        this.salon = salon;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}//Fin clase
