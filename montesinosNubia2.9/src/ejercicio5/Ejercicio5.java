/*
 * Objetivo:  lea un número positivo N y calcule y visualice su factorial N! Siendo el factorial
 * 0! = 1
 * 1! = 1
 * 2! = 2 * 1
 * 3! = 3 * 2* 1
 * N! = N * (N-1) * (N-2) * … * 1
 * 
 * Autor: Nubia Montesinos
 * Fecha:16/10/26
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número: ");
		int factorial = teclado.nextInt();
		
		long resultado=1;
		
		for (int i=1;i<=factorial;i++)  {
			resultado=resultado*i;
		}
		System.out.println("El factorial de  "+factorial+" es: "+resultado);
		  
	}
}

