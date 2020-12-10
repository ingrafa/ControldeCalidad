package com.company;
import java.util.Scanner;

    /**
     *
     * @author Rafael Angamarca
     */
    public class pruebas {

        public static void main(String[] args) {
            int edad ;
            double peso;
            Scanner teclado = new Scanner (System.in);
            System.out.println ("--------------------------:");
            System.out.println ("--------Welcome-----------:");
            System.out.println ("--------------------------:");
            System.out.println ("Inserte Edad de la persona:");
            edad = teclado.nextInt();
            peso = Persona.determinarDosis(edad);

            System.out.println ("La cantidad de pildora que debe de tomar segun su edad y peso es de :kg " +peso);

        }

    }


