/*
 * Objetivo:  lea 100 números no nulos y luego muestre un mensaje de si ha leído algún número negativo o no.
 * 
 * Autor: Nubia Montesinos
 * Fecha: 16/10/26
 */
package ejercicio6;

import java.util.Scanner;
import java.util.Random; // para generar 100 números (no tener que meter 100 números a mano)

public class Ejercicio6 {
	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int numeros=0;
		int contadorNegativos=0;
		boolean negativos = false;
		for (int i=1;i<=10;i++) {
			System.out.println("Ingresa un número "+i+" :");
			numeros = teclado.nextInt();
			if (numeros<0) {
				contadorNegativos= contadorNegativos+1;
				negativos=true;
			}
		}
		
		System.out.println("¿Ha habido algún número negativo?: "+negativos);
	}

}
