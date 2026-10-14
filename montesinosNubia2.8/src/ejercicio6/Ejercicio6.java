/*
 * Objetivo: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
 * 
 * Autor: Nubia Montesinos
 * Fecha: 14/10/26
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int numero=0;
		
		do {
			System.out.print("\nDame un número (negativo para terminar): ");
			numero = teclado.nextInt();
			int cuadrado = numero*numero;
			if (numero>0) {
				System.out.println("El cuadrado de "+numero+" es: "+cuadrado);
			}
		}
		while (numero>0);
		
	}

}
