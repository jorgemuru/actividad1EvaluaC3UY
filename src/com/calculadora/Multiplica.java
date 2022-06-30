package com.calculadora;

public class Multiplica extends Operacion{
    double multiplica;

    public Multiplica(double n1, double n2){
        super(n1,n2,'*');
        this.multiplica = n1 * n2;
    }

}//fin clase
