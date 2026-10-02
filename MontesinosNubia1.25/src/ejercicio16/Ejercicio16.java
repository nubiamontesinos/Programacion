/*
 Objetivo: Escribir un programa en Java para calcular la superficie y el volumen de una esfera a
partir del valor del radio (supóngase que es un valor positivo).

Autor: Nubia Montesinos
Fecha: 2/10/26
 */
package ejercicio16;

public class Ejercicio16 {
	public static void main (String[] args) {

		double radio = 5; 
		
		double superficie = 4 * Math.PI * Math.pow(radio, 2);
		
		double volumen = (4.0 / 3) * Math.PI * Math.pow(radio, 3);
		
		System.out.println("Para una esfera de radio: " + radio);
		System.out.println("La superficie es: " + superficie);
		System.out.println("El volumen es: " + volumen);
	}
}