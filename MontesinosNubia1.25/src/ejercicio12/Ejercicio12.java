/*
 Objetivo: Escribe un programa que calcule el salario semanal de un empleado en base a las horas 
trabajadas, a razón de 12 euros la hora.


Autor: Nubia Montesinos
Fecha: 2/10/26
 */
package ejercicio12;

public class Ejercicio12 {
	
	public static void main (String[] args) {
		
		float horasTrabajadas = 24.5f;
		float salarioSemanal = horasTrabajadas*12;
		
		System.out.println("El salario habiendo trabajado "+horasTrabajadas+" horas semanales es de: "+salarioSemanal+" €");
	}

}
