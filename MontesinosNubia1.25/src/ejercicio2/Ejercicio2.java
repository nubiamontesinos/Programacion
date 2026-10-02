/*
 Objetivo: Escribir un programa en Java que pregunte tu nombre, dirección y teléfono y escriba en
pantalla una ficha.

Autor: Nubia Montesinos
Fecha: 2/10/26
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main (String[] args) {

		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dume tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Dume tu dirección: ");
		String direccion = teclado.nextLine();
		
		System.out.println("Dume tu teléfono: ");
		String telefono = teclado.nextLine();
		
		System.out.println("FICHA DE DATOS\nNombre: "+nombre+"\nDirección: "+direccion+"\nTeléfono: "+telefono);
		
		
	}
}
