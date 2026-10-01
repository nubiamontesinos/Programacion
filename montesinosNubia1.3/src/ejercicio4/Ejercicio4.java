/*
Objetivo: Realizar un programa en Java que solicite al usuario un valor, lo almacene en una variable de
tipo double.
A partir de dicho dato aplicarle las siguientes funciones de la clase Math y mostrar los valores
por pantalla (ceil, floor, round) explicando el resultado obtenido.

Autor: Nubia Montesinos
Fecha: 1/10/26
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número (si es  decimal usar ','. Ejemplo: 2,5): ");
		double num1 = teclado.nextDouble();
		
		System.out.println(Math.round(num1)+" número redondeado a entero más cercano\n"
				+ Math.floor(num1)+" número redondeado hacia abajo\n"
				+Math.ceil(num1)+" número redondeado hacia arriba");
	}

}
