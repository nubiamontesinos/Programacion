/*
 * Objetivo: pedir edad. Si <18 "No tiene la edad requerida para realizar estos estudios".
 * Si >18, pedir nombre y apellidos y mostrar datos y que ha sido admitido
 * 
 * Autor: Nubia Montesinos
 * Fecha: 8/10/26
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Dime tu edad: ");
		byte edad = teclado.nextByte();
		teclado.nextLine();
		
		if (edad>18) {
			System.out.print("Dime tu nombre: ");
			String nombre = teclado.nextLine();
			
			System.out.print("Dime tus apellidos: ");
			String apellidos = teclado.nextLine();
			
			System.out.println("\nNombre: "+nombre+"\nApellidos: "+apellidos+"\nEdad: "+edad+"\n\nUsted ha sido admitido.");
		}
	}

}
