/*
 * Objetivo:  muestre los números desde el 1 hasta un número N que se introducirá por teclado.
 * 
 * Autor: Nubia Montesinos
 * Fecha: 16/10/26
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número: ");
		int numero = teclado.nextInt();
		
		for (int i=1;i<=numero;i++) {
			System.out.println(i);
		}
	}

}
