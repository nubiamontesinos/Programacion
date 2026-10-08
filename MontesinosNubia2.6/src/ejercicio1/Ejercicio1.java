/*
 * Objetivo: solicitar 2 números y comprobar si num1>num2, num1<num2, num1=num2 y mostrar resultado
 * 
 * Autor: Nubia Montesinos
 * Fecha: 8/10/26
 * 
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String[]args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Dame un número entero: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Dame otro número entero: ");
		int num2 = teclado.nextInt();

		if (num1>num2) {
			System.out.println(num1+" > "+num2);
		}
		else if (num1<num2) {
			System.out.println(num1+" > "+num2);
		}
		else {
			System.out.println(num1+ " = "+num2);
		}

	}
}
