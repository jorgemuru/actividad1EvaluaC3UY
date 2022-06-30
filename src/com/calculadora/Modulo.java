package com.calculadora;

public class Modulo extends Operacion{
    double modulo;

    public Modulo(double n1, double n2){
        super(n1,n2,'p');
        this.modulo = Math.pow(n1,n2);
    }
}//fin clase
