/*
 Objetivo: 14. Realiza un conversor de Kb a Mb.

Nombre: Nubia Montesinos
Fecha: 2/10/26

 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
	public  static void main (String[]args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingresa la cantidad de kilobytes: ");
		double kilobytes  = teclado.nextDouble();
		
		double megabytes =  kilobytes*0.001;
		
		System.out.println(kilobytes+ " kilobytes = "+megabytes+ " megabytes");	
		
		
	}
}
