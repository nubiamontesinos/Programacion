/*
 * Objetivo: que pida diez números reales por teclado, los almacene en un array, y
luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
 * 
 * Autor: Nubia Montesinos
 * Fecha: 23/10/26
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double[] numeros = new double[10]; 

		// llenar el array por teclado
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("(" + i + ") Ingresa un número real: ");
			numeros[i] = teclado.nextDouble(); // Leemos el número real
		}
		
		// inizializo máximo y mínimo
		double maximo = numeros[0];
		double minimo = numeros[0];

		// recorrer el array ya lleno para averiguar máximo y mínimo
		for (int i = 0; i < numeros.length; i++) {
			maximo = Math.max(maximo, numeros[i]);
			minimo = Math.min(minimo, numeros[i]);
		}
		
		System.out.println("\nMáximo: " + maximo + "\nMínimo: " + minimo);
		
		teclado.close(); 
	}
}
