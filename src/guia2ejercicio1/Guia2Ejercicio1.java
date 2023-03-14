/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Guia2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic hereScanner leer = new Scanner(System.in)
                Scanner leer = new Scanner(System.in)) {
            int num1, num2, resultado;//defino las variables
            System.out.println("Ingrese el primer numero");//Imprimo por pantalla
            num1 = leer.nextInt();//Ingreso por teclado el numero
            System.out.println("Ingrese el segundo nuemero");
            num2 = leer.nextInt();
            resultado = num1+num2;//Hacemos la operacionn indicada
            System.out.println(num1+ "+" +num2+ "=" +resultado); //Muestro por pantalla la operacion
            //Cierro el leer
        }
    }
    
}
