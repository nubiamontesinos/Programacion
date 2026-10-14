/*
 * Objetivo: mostrar los números del 100 al 1 utilizando la sentencia do..while
 * 
 * Autor: Nubia Montesinos
 * Fecha: 14/10/26
 */
package ejercicio3;

public class Ejercicio3 {

	public static void main (String[] args) {
		
		int numero=100;
		
		do {
			System.out.println(numero);
			numero--;
		}
		while (numero>=1);
	}
}