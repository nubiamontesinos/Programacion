/*
 Objetivo: pedir números hasta que ingrese un negativo. Además, sumar los pares y mostrar la suma
 
 Autor: Nubia Montesinos
 Fecha: 5/10/26
 */
package bucles;

import java.util.Scanner;

public class HastaNegativo {

	public static void main (String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int suma=0;
		int numero=0;
		
		System.out.println("Dame un número (un negativo para terminar): ");
		numero=teclado.nextInt();
	
		while (numero>=0) {
			System.out.println("Dame un número (un negativo para terminar): ");
			numero=teclado.nextInt();
		
			if (numero%2 == 0) {
			suma=suma+numero;
			System.out.println(suma);
			}
		}
	}
}
