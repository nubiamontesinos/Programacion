/*
 * Objetivo: pedir nombre, apellidos, ciclo Formativo, nota academica (entero) y mostrar datos con nota:
 * insuficiente
 * suficiente
 * bien
 * notable
 * sobresaliente
 * 
 * Autor: Nubia Montesinos
 * Fecha: 14/10/26
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Dime tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.print("Dime tu apellidos: ");
		String apellidos = teclado.nextLine();
		
		System.out.print("Dime tu ciclo formativo: ");
		String cicloFormativo = teclado.nextLine();
		
		System.out.print("Dime tu nota: ");
		int nota = teclado.nextInt();
		
		System.out.println("\nNombre: "+nombre+"\nApellidos: "+apellidos+"\nCiclo Formativo: "+cicloFormativo+"\nNota académica: "+nota);
		
		if (nota  >0 && nota<10) {
			if (nota <5) {
				System.out.print("(Insuficiente)");
			}
			else if (nota <6) {
				System.out.print("(Suficiente)");
			}
			else if (nota <7) {
				System.out.print("Bien");
			}
			else if (nota <9) {
				System.out.print("Notable");
			}
			else {
				System.out.print("Sobresaliente");
			}
		}
	}

}
