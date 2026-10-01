/*
Objetivo: Se deberá realizar un programa en java el cual haciendo uso de la entrada estándar solicite los
siguientes datos al usuario:
 Nombre
 Apellidos
 Edad
 Dirección
 Altura
 Peso

Autor: Nubia Montesinos
Fecha: 23/9/26
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Dime tus apellidos: ");
		String apellidos = teclado.nextLine();
		
		System.out.println("Dime tu edad: ");
		byte edad = teclado.nextByte();
		
		teclado.nextLine();
		
		System.out.println("Dime tu dirección: ");
		String direccion = teclado.nextLine();
		
		System.out.println("Dime tu altura en metros (ej: 1,50): ");
		float altura = teclado.nextFloat();
		
		System.out.println("Dime tu peso: ");
		float peso = teclado.nextFloat();
		
		teclado.close();
		
		System.out.println("\nNombre: "+nombre+"\nApellidos: "+apellidos+"\nEdad: "+edad+"\nDirección: "+direccion+"\nAlrura: "+altura+" metros \nPeso: "+peso+" kg");
		
	}

}
