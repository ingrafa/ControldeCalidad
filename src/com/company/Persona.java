package com.company;

/**
 *
 * @author Rafael Angamarca
 */

public class Persona {

    public static double determinarDosis(double a){
       double aux = 0;
        if(a <= 5){
            aux = a * 1;
            System.out.println ("Es un bebé debe tomar media pildora al día 1/2:" );
        }
            else if (a >=6 && a <= 12){

            aux = a * 0.8;
            System.out.println ("Es un niñ@ debe de tomar 1 pildora al dia 1/dia:");
        }
        else if (a >=50) {

            aux = a * 0.8;
            System.out.println ("Es un adulto mayor debe tomar 2 pildoras al día:" );
        }

        else if (a >=13 && a <= 49) {
            aux = a * 0.8;
            System.out.println ("Es una persona promedio debe tomar 2 pildora + extras si sobrepasa de 70 kg");
        }

        return aux;
    }

}
