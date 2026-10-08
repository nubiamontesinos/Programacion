/*
 * Objetivo: 
 * 
 * Autor: Nubia Montesinos
 * Fecha: 8/10/26
 */
package bucles;

import java.util.Scanner;

public class For {
	
	public static void main (String[]args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int cantidadNum, numero, suma=0;
		
		System.out.print("Dime cuántos números: ");
		cantidadNum = teclado.nextInt();
		
		for (int i=1; i<=cantidadNum;i++) {
			System.out.print("Dime el número "+ i+": ");
			numero = teclado.nextInt();
			suma = suma+numero;
		}
		System.out.println("La suma de los números dados es: "+suma);
	}

}
