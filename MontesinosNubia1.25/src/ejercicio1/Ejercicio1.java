/*
 Objetivo. Escribir un programa en Java que pregunte ¿Cómo te llamas?, lea el nombre que
introduces por teclado, por ejemplo Albert y escriba en pantalla Hola Albert.

Autor: Nubia Montesinos
Fecha: 2/10/26
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String [] args) {
	
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String nombre = teclado.nextLine();

		System.out.println("Hola, "+nombre);
	}

}
