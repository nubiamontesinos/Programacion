/*
 * Objetivo: pedir nota media en 4 asignaturas, la nota double.
 * - Calcular la nota media y mostrarla al usuario
 * - Mostrar la nota media pero redondeada hacia arriba
 * - Mostrar la nota media redondeada hacia abajo
 * Si nota >8 mostrar "puede acceder a estudios superiores", que no es suficiente para acceder a los estudios que deseaba.
 *
 *Autor: Nubia Montesinos
 *Fecha: 7/10/26
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main (String[]args) {
		
		Scanner teclado=new Scanner(System.in);
		
		
		System.out.print("Dame la media en la primera asignatura: ");
		double nota1 = teclado.nextDouble();
		
		System.out.print("Dame la media en la primera asignatura: ");
		double nota2 = teclado.nextDouble();
				
		System.out.print("Dame la media en la primera asignatura: ");
		double nota3 = teclado.nextDouble();
		
		System.out.print("Dame la media en la primera asignatura: ");
		double nota4 = teclado.nextDouble();
		
		double media=(nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Nota media redondeada hacia arriba: "+Math.ceil(media)
		+"\nNota media redondeada hacia abajo: "+Math.floor(media));
		
		if (media > 8) {
			System.out.println("Puede acceder a estudios superiores");
		}
		else if (media <8) {
			System.out.println("No es suficiente para acceder a los estudios que deseaba.");
		}
	}

}
