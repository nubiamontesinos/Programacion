/*
 * Objetivo: igual que el anterior, pero si experiencia >2 y proyectos>3 =contratado. 
 * Mostraremos un mensaje "Enhorabuena. Ha sido contratado"
 * Si  trabajador experiencia >5 o proyetos> 5 salario anual= 30.000 euros. 
 * En caso opuesto 25.000. Se le mostrará por pantalla un mensaje indicádonle el salario a percibir
 * 
 * Autor: Nubia Montesinos
 * Fecha: 7/10/26
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main (String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		String nombre, apellidos;
		byte edad;
		float salario;
		
		System.out.println("Dime tu nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("Dime tu apellido: ");
		apellidos = teclado.nextLine();
		
		System.out.println("Dime tu edad: ");
		edad = teclado.nextByte();
		
		System.out.println("Dime tu salario deseado (anual): ");
		salario = teclado.nextFloat();
		
		
		if (salario >30000 || edad>45) {
			System.out.println("Lo sentimos, "+nombre+" "+apellidos+", pero no cumple nuestro perfil");
		}
		else {
			System.out.println("Dime tus años de experiencia (nº entero)");
			int experiencia = teclado.nextInt();
			
			System.out.println("Dime en cuántos proyectos has trabajado: ");
			int proyectos = teclado.nextInt();
			
			if (experiencia>2 && proyectos>3) {
				System.out.println("Enhorabuena. Ha sido contratado");
			}
			else {
				System.out.println("Enhorabuena. Ha sido contratado y su salario será 25.000€ anuales");
			}
		}
	}
}
