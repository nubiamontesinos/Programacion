/*
 * Objetivo: adivinar un número entero. Para ello el programa calculará un
número aleatorio N entre 0 y 50. Luego el programa irá pidiendo números indicando
“mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
cuando el usuario acierta.

Autor: Nubia Montesinos 
Fecha: 14/10/26
 */
package ejercicio7;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio7 {
	
	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1,51);
		
		int numero=0;
		
		while (!(numero==numeroAleatorio)) {
			System.out.println("Intenta adivinar el número: ");
			 numero = teclado.nextInt();
			 
			 if (numero > numeroAleatorio) {
					System.out.println(numero+" es > que el número a adivinar.");
				}
				else if (numero < numeroAleatorio) {
					System.out.println(numero+" es < que el número a adivinar.");
				}
				else {
					System.out.println("FELICIDADES. Lo has adivinado ("+numero+")");
				}
		}
		
	}

}
