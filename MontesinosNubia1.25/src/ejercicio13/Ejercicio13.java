/*
Objetivo: 13. Realiza un conversor de Mb a Kb.

Autor: Nubia Montesinos
Fecha: 2/10/26
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingresa la cantidad de megabytes: ");
		double megabytes  = teclado.nextDouble();
		
		double kilobytes =  megabytes*1000;
		
		System.out.println(megabytes+ " megabytes = "+kilobytes+ " kilobytes");
		
	}
}
