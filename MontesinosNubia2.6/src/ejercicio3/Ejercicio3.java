/*
 * Objetivo: solicitar nota (int). Indicar la calificación correspondiente a cada caso. 
 * Desde 0 hasta 10, en caso opuesto, en el default indicar que la nota introducida ha sido incorrecta.
 * 
 * Autor: Nubia Montesinos
 * Fecha: 7/10/26
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void  main (String[]args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int nota;
		
		System.out.print("Dame tu nota: ");
		nota = teclado.nextInt();
		
		
		switch (nota) { // habría usado if simple, pero como lo pide el enunciado (mencionando  default), lo hago así
			
			case 0: {
			System.out.println("Tu nota es "+nota);
			break;
			}
		
			case 1: {
				System.out.println("Tu nota es "+nota);
				break;
			}
			
			case 2: {
				System.out.println("tu nota es "+nota);
				break;
			}
			case 3: {
				System.out.println("tu nota es "+nota);
				break;
			}
			case 4: {
				System.out.println("tu nota es "+nota);
				break;
			}
			case 5: {
				System.out.println("tu nota es "+nota);
				break;
			}
			case 6: {
				System.out.println("tu nota es "+nota);
				break;
			}
			case 7: {
				System.out.println("tu nota es "+nota);
				break;
			}
			case 8: {
				System.out.println("tu nota es "+nota);
				break;
			}
			case 9: {
				System.out.println("tu nota es "+nota);
				break;
			}
			case 10: {
				System.out.println("tu nota es "+nota);
				break;
			}
			default: {
				System.out.println("La nota introducida es incorrecta");
				break;
			}
		
		}

	}
}
