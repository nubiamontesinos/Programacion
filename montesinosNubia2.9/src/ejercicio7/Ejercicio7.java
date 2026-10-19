/*
 * Objetivo:  lea 100 números no nulos y luego muestre un mensaje indicando cuántos son positivos y cuantos negativos
 * 
 * Autor: Nubia Montesinos
 * Fecha:19/10/26
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main (String[]args) {
		Scanner teclado=new Scanner(System.in);
				
				int numeros=0;
				int contadorNegativos=0;
				int contadorPositivos=0;
				
				for (int i=1;i<=100;i++) {
					System.out.println("Ingresa un número "+i+" :");
					numeros = teclado.nextInt();
					if (numeros<0) {
						contadorNegativos= contadorNegativos+1;
					}
					else if (numeros>0) {
						contadorPositivos=contadorPositivos+1;
					}
				}
				
				System.out.println("Cantidad de números negativos: "+contadorNegativos+
						"\nCantidad de números positivos: "+contadorPositivos);	
	}

}
