/*
 * Objetivo: solicitar número al usuario, caluclar el doble del mismo y mostrarlo por pantalla
 * Autor: Nubia
 * Fecha: 23/9/26
 */
package operaciones;

import java.util.Scanner;

public class CalcularOperaciones {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double numero1, numero2;
		double suma;
		double resta;
		double multi;
		double divi;
		
		System.out.println("Ingrese un número: ");
		numero1 = teclado.nextFloat();
		
		System.out.println("Ingrese un segundo número: ");
		numero2 = teclado.nextFloat();
	
		teclado.close();
		
		suma = numero1+numero2;
		resta = numero1-numero2;
		multi = numero1*numero2;
		divi = numero1/numero2;
		
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
		System.out.println("La multiplicación es: "+multi);
		System.out.println("La división es: "+divi);

	}

}
