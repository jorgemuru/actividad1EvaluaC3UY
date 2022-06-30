package com.calculadora;

public class Division extends Operacion{
    double division;

    public Division(double n1, double n2){
        super(n1,n2,'/');
        this.division = n1 / n2;
    }

}//fin clase
