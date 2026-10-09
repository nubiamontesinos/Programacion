/*
 * Objetivo: pedir nombre, apellidos, ciclo Formativo, nota academica (entero) y mostrar datos con nota 
 * insuficiente
 * suficiente
 * bien
 * notable
 * sobresaliente
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Dime tu apellidos: ");
		String apellidos = teclado.nextLine();
		
		System.out.println("Dime tu ciclo formativo: ");
		String cicloFormativo = teclado.nextLine();
		
		System.out.println("Dime tu nombre: ");
		int nota = teclado.nextInt();
		
		System.out.println("Nombre: "+nombre+"\nApellidos: "+apellidos+"\nCiclo Formativo: "+cicloFormativo+"Nota académica: "+nota);
		
		if (nota <5) {
			System.out.print("(Insuficiente)");
		}
		else (nota <6) {
			System.out.print("(Insuficiente)");
		}
	}

}
