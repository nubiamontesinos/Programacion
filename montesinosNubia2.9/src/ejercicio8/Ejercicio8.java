/*  * Objetivo: lea una secuencia de números no nulos hasta que se introduzca un 0  
 * y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos  
 *   
 * Autor: Nubia Montesinos  
 * Fecha: 19/10/26  
 */ 
package ejercicio8;  

import java.util.Scanner;  

public class Ejercicio8 {  
	public static void main (String[]args) { 		 		
		Scanner teclado = new Scanner(System.in); 
		
		int numeros; 		
		int contadorPositivos = 0; 		
		int contadorNegativos = 0; 		 		 		
		
		System.out.print("Dame un número (0 para terminar): ");  		
		numeros = teclado.nextInt(); 			 			 		
		
		
		while (numeros != 0) { 			
			// manejo los contadores antes de pedir el número pq si no muestra 1 menos de los que son
			if (numeros > 0) { 				
				contadorPositivos++; 
			} 			
			else if (numeros < 0) { 				
				contadorNegativos++; 			
			} 			
			
			System.out.print("Dame un número (0 para terminar): ");  			
			numeros = teclado.nextInt(); 		
		} 		
		
		if (contadorNegativos > 0) { 			
			System.out.println("Se ha introducido uno o varios números negativos."); 		
		} else {
			System.out.println("No se han introducido números negativos.");
		}
		
		System.out.println("Números positivos: " + contadorPositivos);
		System.out.println("Números negativos: " + contadorNegativos); 		 	
		
		teclado.close(); 
	} 
}
