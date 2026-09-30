/* 
 * Objetivo: pedir número a usuario y mostrar su raíz cuadrada
 * Autor: Nubia
 * Fecha: 25/9/26
 */
package operaciones;

import java.util.Scanner;

public class RaizCuadrada {

	public  static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa el número del que quieres la raíz cuadrada: ");
		double numero = teclado.nextDouble();
		double resultado;
		
		resultado = Math.sqrt(numero);
		System.out.println("La raíz cuadrada de "+numero+" es "+resultado);
		
		
	}
	
}
