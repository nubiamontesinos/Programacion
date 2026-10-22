/*
 * Objetivo: que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores.
 * 
 * Autor: Nubia Montesinos
 * Fecha: 22/10/26
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static  void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int[] numeros = new int[10];
		
		// que solo ean reales HACER
		for (int i=0;i<numeros.length;i++) {
			System.out.println(i+" Ingresa un número real: ");
			numeros[i] = teclado.nextInt();
		}
		for (int i=0;i<numeros.length;i++)
		System.out.println(numeros[i]);
		
	}

}
