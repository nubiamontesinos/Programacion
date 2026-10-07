/*
 * Objetivo: pedir número y sumarlos hasta 0
 * Autor: Nubia Montesinos
 * Fecha: 7/20/26
 */

package bucles;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		
		int numero, suma=0;
		
		do {
			System.out.print("Dame un número (0 para terminar): ");
			numero = teclado.nextInt();
			suma = suma+numero;
		}
		while (numero !=0);
		
		System.out.println("\nLa suma es: "+suma);
	}
}

