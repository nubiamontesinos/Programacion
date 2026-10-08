/*
 * Objetivo: pedir número inicial, final y mostrar números entre ellos que sean múltiplo de 3
 * 
 * Autor: Nubia Montesinos
 * Fecha: 8/10/26
 */
package bucles;

import java.util.Scanner;

public class ForEjemplo {
	public static void main (String[]args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Dime el número de inicio (entero): ");
		int numInicio = teclado.nextInt();
		
		System.out.print("Dime el número de final (entero): ");
		int numFinal = teclado.nextInt();
				
		for (int i=numInicio; i<=numFinal;i++) {
			if (i%3 == 0) {
					System.out.println(i + " ");
			}
		}
	}

}
