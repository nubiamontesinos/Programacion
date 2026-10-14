/*
 * Objetivo: Pedir 10 números. Mostrar la media de los números positivos, la media de los números
negativos y la cantidad de ceros.

Autor: Nubia Montesinos
Fecha: 14/10/26
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		
		int numero;
		int positivos=0;
		int contadorPositivos=0;
		int negativos=0;
		int contadorNegativos=0;
		int contadorCeros=0;
		
		for (int i=0;i<=10;i++) {
			System.out.println("Dame el número (entero): "+i+": ");
			numero=teclado.nextInt();
			
			if (numero>0) {
				positivos=positivos+numero;
				contadorPositivos++;
			}
			else if (numero<0) {
				negativos=negativos+numero;
				contadorNegativos++;
			}
			else {
				contadorCeros++;
			}
		}
		System.out.println("Media de los números positivos: "+(positivos/contadorPositivos));
		System.out.println("Media de los números negativos: "+(negativos/contadorNegativos));
		System.out.println("Cantidad de ceros: "+contadorCeros);

	}
}