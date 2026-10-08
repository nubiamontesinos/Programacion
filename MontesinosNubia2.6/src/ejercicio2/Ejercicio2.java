/*
 * Objetivo: solicitar nombre, edad y nota académica
 * Acceder = >18 y nota>7
 * - Si sí: "<Nombre>, usted ha sido admitido en el curso, cumple las condiciones requeridas".
 * - Si no: "<Nombre>, lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos"
 * 
 * Autor: Nubia Montesinos
 * Fecha: 8/10/26
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Dime tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.print("Dime tu edad: ");
		byte edad = teclado.nextByte();
		
		System.out.print("Dime tu nota académica: ");
		float nota = teclado.nextFloat();
		
		if (edad>18 && nota>7) {
			System.out.println(nombre+", usted ha sido admitido en el curso, cumple las condiciones requeridas");
		}
		else {
			System.out.println(nombre+", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");
		}
	}

}
