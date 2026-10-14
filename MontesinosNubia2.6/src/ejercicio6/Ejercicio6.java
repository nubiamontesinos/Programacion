/*
 * Objetivo: pedir datos y nota, mostrarlos 
 * (indicando que tipo de nota; insuficiente, suficiente, bien, notable, sobre y matrícula de honor)
 * Si la nota proporcionada <0 o >10, "La nota académica indicada es incorrecta"
 * 
 * Autor: Nubia Montesinos
 * Fecha: 14/110/26
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
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
		
		if (nota  >0 && nota<=10) {
			if (nota <5) {
				System.out.print(" (Insuficiente)");
			}
			else if (nota <6) {
				System.out.print(" (Suficiente)");
			}
			else if (nota <7) {
				System.out.print(" (Bien)");
			}
			else if (nota <9) {
				System.out.print(" (Notable)");
			}
			else if (nota <10){
				System.out.print(" (Sobresaliente)");
			}
			else {
				System.out.print(" (Matrícula de Honor)");
			}
		}
		else {
			System.out.print ("La nota académica indicada es incorrecta");
		}
	}

}
