/*
 * Objetivo: que pida diez números reales por teclado, los almacene en un array,
 *  y luego muestre la suma de todos los valores
 * 
 * Autor: Nubia Montesinos
 * Fecha:23/10/26
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main (String[]args) {
		Scanner teclado=new Scanner(System.in);
		int[] numeros = new int[10];
		int suma=0;
		
		// que solo ean reales HACER
		for (int i=0;i<numeros.length;i++) {
			System.out.println("("+i+") Ingresa un número real: ");
			numeros[i] = teclado.nextInt();
			suma=numeros[i]+suma;
		}
		for (int i=0;i<numeros.length;i++);
		System.out.println(suma);
	}
}
