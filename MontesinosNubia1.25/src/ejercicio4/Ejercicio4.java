/*
 Objetivo: Escribe un programa que muestre tu horario de clase. Puedes usar espacios o tabuladores
para alinear el texto.

Autor: Nubia Montesinos
Fecha: 2/10/26
 */
package ejercicio4;

public class Ejercicio4 {

	public static void main (String[] args) {
		
		System.out.println("HORARIO DE CLASES - 1º DAM (IES PLAYAMAR)\n");
		
		// días semana (%n salto de línea)
		System.out.printf("%-12s %-15s %-15s %-15s %-15s %-15s%n", "Horas", "Lunes", "Martes", "Miérc.", "Jueves", "Viernes");
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		// 15:15 - 16:15
		System.out.printf("%-12s %-15s %-15s %-15s %-15s %-15s%n", "15:15 - 16:15", "BDDAM", "SIDAM", "BDDAM", "SIDAM", "LMDAM");
		
		// 16:15 - 17:15
		System.out.printf("%-12s %-15s %-15s %-15s %-15s %-15s%n", "16:15 - 17:15", "PROG", "SIDAM", "BDDAM", "SIDAM", "LMDAM");
		
		// 17:15 - 18:15
		System.out.printf("%-12s %-15s %-15s %-15s %-15s %-15s%n", "17:15 - 18:15", "PROG", "SIDAM", "EDDAM", "SOS", "LMDAM");
		
		// 18:30 - 19:30 (y recreo de 18:15-18:30)
		System.out.printf("%-12s %-15s %-15s %-15s %-15s %-15s%n", "18:30 - 19:30", "IPE1", "BDDAM", "EDDAM", "DIGFP", "EDDAM");
		
		// 19:30 - 20:30
		System.out.printf("%-12s %-15s %-15s %-15s %-15s %-15s%n", "19:30 - 20:30", "IPE1", "BDDAM", "PROG", "PROG", "PROG");
		
		// 20:30 - 21:30
		System.out.printf("%-12s %-15s %-15s %-15s %-15s %-15s%n", "20:30 - 21:30", "IPE1", "BDDAM", "PROG", "PROG", "PROG");
		
	}
}