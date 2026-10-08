/*
 * Objetivo: 
 * 1) Solicitar al usuario los siguientes datos:
 * - Nombre, apellidos, edad y salario deseado
 * - Si el salario deseado supera los 30.000 euros o la edad es superior a 45 años el candidat@ queda descartado. 
 * Mostramos un mensaje indicándolo y termina el programa. " Lo sentimos pero no cumple nuestro perfil"
 * 2) En caso contrario continuamos con la entrevista, preguntando los siguientes datos:
 * - Años de experiencia
 * - Proyectos trabajados anteriormente
 * Si los años de experiencia superan los 2 y ha trabajado en más de 3 proyectos será contratado.
 * Mostraremos un mensaje "Enhorabuena. Ha sido contratado"
 * En caso contrario mostrar un mensaje: . " Lo sentimos pero no cumple nuestro perfil"
 * 
 * Autor: Nubia Montesino
 * Fecha: 7/10/26
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

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
				System.out.println("Lo sentimos pero no cumple nuestro perfil");
			}
		}
	}

}
