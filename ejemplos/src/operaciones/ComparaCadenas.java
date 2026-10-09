/*
 * Objetivo: adivina una palabra
 * 
 * Autor: Nubia Montesinos
 * Fecha: 9/10/26
 */
package operaciones;

import java.util.Scanner;

public class ComparaCadenas {
	
	public static void main (String[] args) {
		
		final String PALABRA = "rojo";
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Adivina la palabra: ");
		String cadena = teclado.nextLine();
		
		if (PALABRA.equals(cadena)) { // usar .equalsIgnoreCase para que no distinga entre MAYÚSCULAS y minúsculas
			System.out.println("SÍ, has adivinado la palabra ("+PALABRA+")");
		}
		else {
			System.out.println("No las adivinado. Era ("+PALABRA+")");
		}
	}

}
